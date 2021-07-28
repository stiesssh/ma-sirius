package de.unistuttgart.ma.backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.gropius.GropiusFactory;
import de.unistuttgart.gropius.Project;
import de.unistuttgart.gropius.slo.SloFactory;
import de.unistuttgart.gropius.slo.SloRule;
import de.unistuttgart.gropius.slo.Violation;
import de.unistuttgart.ma.saga.SagaFactory;
import de.unistuttgart.ma.saga.System;
import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.ImpactFactory;

/**
 * Apparently,  the MongoMapper can not handle the complex sturcture of Notifcation and System 
 * java.lang.StackOverflowError
 *	at org.springframework.util.ConcurrentReferenceHashMap.getReference(ConcurrentReferenceHashMap.java:264)
 *	[...]
 * making thing transient would most likely fix this, but i dont want to add additional annotattions to the generated files. 
 *
 * @author maumau
 *
 */
@ContextConfiguration(classes = TestContext.class)
@DataMongoTest
@ActiveProfiles("test")
public class RepositoryTest extends FooTest {
	
	@Test
	public void impactRepoProxyTest() throws IOException {
		loadSystem();
		// create 
		ComponentInterface creditInstituteFace = system.getComponentInterfaceById("5e8cf780c585a029");
		ComponentInterface paymentFace = system.getComponentInterfaceById("5e8cf760d345a028");
		SloRule rule = system.getSloForNode(creditInstituteFace).iterator().next();

		Violation violation = SloFactory.eINSTANCE.createViolation();
		violation.setSloRule(rule);

		Impact impact = ImpactFactory.eINSTANCE.createImpact();
		impact.setLocation(paymentFace);
		impact.setRootCause(violation);

		// save
		notificationRepoProxy.save(impact, systemId);		
		assertEquals(1, notificationRepo.count());		
		
		// load
		Set<Impact> impacts = notificationRepoProxy.findBySystemId(systemId);
		
		// asserts
		assertNotNull(impacts);
		assertEquals(1, impacts.size());
		
		Impact actual = impacts.iterator().next();
		
		assertNotNull(actual);
		assertEquals(impact.getLocationId(), actual.getLocationId());
		assertEquals(impact.getLocation(), actual.getLocation());
		assertEquals(impact.getRootCause().getSloRule(), actual.getRootCause().getSloRule());
	}
	
	@Test
	public void systemRepoProxyTest() throws IOException {	
		loadSystem();
		
		System actual = systemRepoProxy.findById(systemId);
		
		assertNotNull(actual);
		assertNotNull(actual.getArchitecture());
		assertNotNull(actual.getProcesses());
		assertNotNull(actual.getSagas());
		assertNotNull(actual.getSloRules());
		
		assertFalse(actual.getArchitecture().getComponents().isEmpty());
		assertFalse(actual.getProcesses().isEmpty());
		assertFalse(actual.getSagas().isEmpty());
		assertFalse(actual.getSloRules().isEmpty());
		
		assertEquals(system.getId(), actual.getId());
	}
	

	@Test
	public void emptySystemRepoProxyTest() throws IOException {
		// prepare system with resource
		System emptySystem = SagaFactory.eINSTANCE.createSystem();
		String filename = "foo.saga";
		String id = systemRepoProxy.getIdForFilename(filename);
		
		Project arch = GropiusFactory.eINSTANCE.createProject();
		arch.setId("someId");
		emptySystem.setArchitecture(arch);
		
		Resource resource = set.createResource(URI.createPlatformResourceURI(filename, false));
		resource.getContents().add(emptySystem);		
		emptySystem.setId(id);
		
		// execute & assert
		systemRepoProxy.save(emptySystem);
		
		assertEquals(1, systemRepo.count());
		
		System actual = systemRepoProxy.findById(id);
		
		assertNotNull(actual);
		assertEquals(emptySystem.getId(), actual.getId());
	}
}



