package de.unistuttgart.ma.importer.architecture;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import de.foo.generated.Project;
import de.foo.generated.Query;
import de.foo.generated.QueryQuery;
import de.unistuttgart.gropius.Component;
import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.ma.saga.SagaFactory;


/**
 * 
 * TODO : change flow to this : get projects by name -> display them, make user choose one, becaus enames are not unique and i cant not query by id... apparently? 
 * 
 * @author maumau
 *
 */
public class GropiusImporter {//implements ArchitectureImporter {

	private final GropiusApiQuerier manager;
	private final SagaFactory factory;
	private final String projectId;
	
	private final DataMapper mapper;

	public GropiusImporter(String uri, String projectId, SagaFactory factory) {
		super();
		this.manager = new GropiusApiQuerier(uri);
		this.factory = factory;
		this.projectId = projectId;
		this.mapper = new DataMapper();
	}
	
	public Set<Component> parse() { 
		QueryQuery queryQuery = GropiusApiQueries.getSingleProjectQuery(projectId);
		System.out.println(queryQuery.toString());
		try {
			Query query = manager.query(queryQuery);
			return parse(query);
		} catch (IOException | InterruptedException e) {
			// TODO do better. 
			e.printStackTrace();
		}
		throw new IllegalArgumentException("could not parse project");
	}
	
	private Set<Component> parse(Query response) {
		
		Set<Component> comps = new HashSet<>();
		
		
		// add the projects
		for (de.foo.generated.Project gropiusProject : response.getProjects().getNodes()) {
		
			// parse all components with provided interfaces
			for (de.foo.generated.Component gropiusComponent : gropiusProject.getComponents().getNodes()) {
				
				
				Component component = mapper.getEcoreComponent(gropiusComponent);
				comps.add(component);
				
				// provided
				for (de.foo.generated.ComponentInterface gropiusInterface : gropiusComponent.getInterfaces().getNodes()) {
					ComponentInterface face = mapper.getEcoreInterface(gropiusInterface); 				
					component.getInterfaces().add(face);
				}
				// consumed
				for (de.foo.generated.ComponentInterface gropiusInterface : gropiusComponent.getConsumedInterfaces().getNodes()) {
					ComponentInterface face = mapper.getEcoreInterface(gropiusInterface); 				
					component.getConsumedInterfaces().add(face);
				}	
			}
		}
		return comps;
	}
}
