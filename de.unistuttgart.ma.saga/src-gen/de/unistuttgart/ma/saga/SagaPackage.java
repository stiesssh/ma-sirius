/**
 */
package de.unistuttgart.ma.saga;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.unistuttgart.ma.saga.SagaFactory
 * @model kind="package"
 * @generated
 */
public interface SagaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "saga";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/saga";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "saga";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SagaPackage eINSTANCE = de.unistuttgart.ma.saga.impl.SagaPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.IdentifiableElementImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getIdentifiableElement()
	 * @generated
	 */
	int IDENTIFIABLE_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.ProjectImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = IDENTIFIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sagas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SAGAS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROCESSES = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__COMPONENTS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Notifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NOTIFICATIONS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.ElementWithSLO <em>Element With SLO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.ElementWithSLO
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getElementWithSLO()
	 * @generated
	 */
	int ELEMENT_WITH_SLO = 5;

	/**
	 * The feature id for the '<em><b>Slo Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_SLO__SLO_RULES = 0;

	/**
	 * The number of structural features of the '<em>Element With SLO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_SLO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element With SLO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_WITH_SLO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.ComponentAdapterImpl <em>Component Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.ComponentAdapterImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getComponentAdapter()
	 * @generated
	 */
	int COMPONENT_ADAPTER = 1;

	/**
	 * The feature id for the '<em><b>Slo Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ADAPTER__SLO_RULES = ELEMENT_WITH_SLO__SLO_RULES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ADAPTER__ID = ELEMENT_WITH_SLO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ADAPTER__NAME = ELEMENT_WITH_SLO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ADAPTER__DESCRIPTION = ELEMENT_WITH_SLO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Issue On Location</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ADAPTER__ISSUE_ON_LOCATION = ELEMENT_WITH_SLO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ADAPTER__OWNER = ELEMENT_WITH_SLO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ims</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ADAPTER__IMS = ELEMENT_WITH_SLO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ADAPTER__ISSUES = ELEMENT_WITH_SLO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ADAPTER__PROJECTS = ELEMENT_WITH_SLO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ADAPTER__INTERFACES = ELEMENT_WITH_SLO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Consumed Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ADAPTER__CONSUMED_INTERFACES = ELEMENT_WITH_SLO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ADAPTER__LABELS = ELEMENT_WITH_SLO_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Component Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ADAPTER_FEATURE_COUNT = ELEMENT_WITH_SLO_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Component Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ADAPTER_OPERATION_COUNT = ELEMENT_WITH_SLO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.ComponentInterfaceAdapterImpl <em>Component Interface Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.ComponentInterfaceAdapterImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getComponentInterfaceAdapter()
	 * @generated
	 */
	int COMPONENT_INTERFACE_ADAPTER = 2;

	/**
	 * The feature id for the '<em><b>Slo Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_ADAPTER__SLO_RULES = ELEMENT_WITH_SLO__SLO_RULES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_ADAPTER__ID = ELEMENT_WITH_SLO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_ADAPTER__NAME = ELEMENT_WITH_SLO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_ADAPTER__DESCRIPTION = ELEMENT_WITH_SLO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Issue On Location</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_ADAPTER__ISSUE_ON_LOCATION = ELEMENT_WITH_SLO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_ADAPTER__COMPONENT = ELEMENT_WITH_SLO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Consumed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_ADAPTER__CONSUMED_BY = ELEMENT_WITH_SLO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Next Level Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_ADAPTER__NEXT_LEVEL_ELEMENTS = ELEMENT_WITH_SLO_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Component Interface Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_ADAPTER_FEATURE_COUNT = ELEMENT_WITH_SLO_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Component Interface Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_ADAPTER_OPERATION_COUNT = ELEMENT_WITH_SLO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.SagaImpl <em>Saga</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.SagaImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getSaga()
	 * @generated
	 */
	int SAGA = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA__NAME = IDENTIFIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA__STEPS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Saga</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Saga</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.SagaStepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.SagaStepImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getSagaStep()
	 * @generated
	 */
	int SAGA_STEP = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_STEP__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_STEP__NAME = IDENTIFIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Next Level Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_STEP__NEXT_LEVEL_ELEMENTS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_STEP__NEXT_STEP = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_STEP_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_STEP_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.ChainLinkImpl <em>Chain Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.ChainLinkImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getChainLink()
	 * @generated
	 */
	int CHAIN_LINK = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_LINK__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_LINK__NAME = IDENTIFIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Location Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_LINK__LOCATION_ID = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chain Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_LINK_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Chain Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_LINK_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.ViolationImpl <em>Violation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.ViolationImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getViolation()
	 * @generated
	 */
	int VIOLATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION__ID = CHAIN_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION__NAME = CHAIN_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Location Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION__LOCATION_ID = CHAIN_LINK__LOCATION_ID;

	/**
	 * The feature id for the '<em><b>Passing Impacts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION__PASSING_IMPACTS = CHAIN_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Violated Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION__VIOLATED_RULE = CHAIN_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_FEATURE_COUNT = CHAIN_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Violation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIOLATION_OPERATION_COUNT = CHAIN_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.ImpactImpl <em>Impact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.ImpactImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getImpact()
	 * @generated
	 */
	int IMPACT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__ID = CHAIN_LINK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__NAME = CHAIN_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Location Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__LOCATION_ID = CHAIN_LINK__LOCATION_ID;

	/**
	 * The feature id for the '<em><b>Caused By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT__CAUSED_BY = CHAIN_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_FEATURE_COUNT = CHAIN_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPACT_OPERATION_COUNT = CHAIN_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.NotificationImpl <em>Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.NotificationImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__NAME = IDENTIFIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Chainlinks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__CHAINLINKS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Top Level Impact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__TOP_LEVEL_IMPACT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see de.unistuttgart.ma.saga.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.ma.saga.Project#getSagas <em>Sagas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sagas</em>'.
	 * @see de.unistuttgart.ma.saga.Project#getSagas()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Sagas();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.ma.saga.Project#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processes</em>'.
	 * @see de.unistuttgart.ma.saga.Project#getProcesses()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Processes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.ma.saga.Project#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see de.unistuttgart.ma.saga.Project#getComponents()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.ma.saga.Project#getNotifications <em>Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notifications</em>'.
	 * @see de.unistuttgart.ma.saga.Project#getNotifications()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Notifications();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.ComponentAdapter <em>Component Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Adapter</em>'.
	 * @see de.unistuttgart.ma.saga.ComponentAdapter
	 * @generated
	 */
	EClass getComponentAdapter();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.ComponentInterfaceAdapter <em>Component Interface Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Interface Adapter</em>'.
	 * @see de.unistuttgart.ma.saga.ComponentInterfaceAdapter
	 * @generated
	 */
	EClass getComponentInterfaceAdapter();

	/**
	 * Returns the meta object for the reference list '{@link de.unistuttgart.ma.saga.ComponentInterfaceAdapter#getNextLevelElements <em>Next Level Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next Level Elements</em>'.
	 * @see de.unistuttgart.ma.saga.ComponentInterfaceAdapter#getNextLevelElements()
	 * @see #getComponentInterfaceAdapter()
	 * @generated
	 */
	EReference getComponentInterfaceAdapter_NextLevelElements();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.Saga <em>Saga</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Saga</em>'.
	 * @see de.unistuttgart.ma.saga.Saga
	 * @generated
	 */
	EClass getSaga();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.ma.saga.Saga#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see de.unistuttgart.ma.saga.Saga#getSteps()
	 * @see #getSaga()
	 * @generated
	 */
	EReference getSaga_Steps();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.SagaStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see de.unistuttgart.ma.saga.SagaStep
	 * @generated
	 */
	EClass getSagaStep();

	/**
	 * Returns the meta object for the reference list '{@link de.unistuttgart.ma.saga.SagaStep#getNextLevelElements <em>Next Level Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next Level Elements</em>'.
	 * @see de.unistuttgart.ma.saga.SagaStep#getNextLevelElements()
	 * @see #getSagaStep()
	 * @generated
	 */
	EReference getSagaStep_NextLevelElements();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.ma.saga.SagaStep#getNextStep <em>Next Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Step</em>'.
	 * @see de.unistuttgart.ma.saga.SagaStep#getNextStep()
	 * @see #getSagaStep()
	 * @generated
	 */
	EReference getSagaStep_NextStep();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.ElementWithSLO <em>Element With SLO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element With SLO</em>'.
	 * @see de.unistuttgart.ma.saga.ElementWithSLO
	 * @generated
	 */
	EClass getElementWithSLO();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.ma.saga.ElementWithSLO#getSloRules <em>Slo Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slo Rules</em>'.
	 * @see de.unistuttgart.ma.saga.ElementWithSLO#getSloRules()
	 * @see #getElementWithSLO()
	 * @generated
	 */
	EReference getElementWithSLO_SloRules();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.Violation <em>Violation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Violation</em>'.
	 * @see de.unistuttgart.ma.saga.Violation
	 * @generated
	 */
	EClass getViolation();

	/**
	 * Returns the meta object for the reference list '{@link de.unistuttgart.ma.saga.Violation#getPassingImpacts <em>Passing Impacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passing Impacts</em>'.
	 * @see de.unistuttgart.ma.saga.Violation#getPassingImpacts()
	 * @see #getViolation()
	 * @generated
	 */
	EReference getViolation_PassingImpacts();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.ma.saga.Violation#getViolatedRule <em>Violated Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Violated Rule</em>'.
	 * @see de.unistuttgart.ma.saga.Violation#getViolatedRule()
	 * @see #getViolation()
	 * @generated
	 */
	EReference getViolation_ViolatedRule();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.Impact <em>Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impact</em>'.
	 * @see de.unistuttgart.ma.saga.Impact
	 * @generated
	 */
	EClass getImpact();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.ma.saga.Impact#getCausedBy <em>Caused By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Caused By</em>'.
	 * @see de.unistuttgart.ma.saga.Impact#getCausedBy()
	 * @see #getImpact()
	 * @generated
	 */
	EReference getImpact_CausedBy();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.ChainLink <em>Chain Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Link</em>'.
	 * @see de.unistuttgart.ma.saga.ChainLink
	 * @generated
	 */
	EClass getChainLink();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.ma.saga.ChainLink#getLocationId <em>Location Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Id</em>'.
	 * @see de.unistuttgart.ma.saga.ChainLink#getLocationId()
	 * @see #getChainLink()
	 * @generated
	 */
	EAttribute getChainLink_LocationId();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification</em>'.
	 * @see de.unistuttgart.ma.saga.Notification
	 * @generated
	 */
	EClass getNotification();

	/**
	 * Returns the meta object for the containment reference list '{@link de.unistuttgart.ma.saga.Notification#getChainlinks <em>Chainlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chainlinks</em>'.
	 * @see de.unistuttgart.ma.saga.Notification#getChainlinks()
	 * @see #getNotification()
	 * @generated
	 */
	EReference getNotification_Chainlinks();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.ma.saga.Notification#getTopLevelImpact <em>Top Level Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Top Level Impact</em>'.
	 * @see de.unistuttgart.ma.saga.Notification#getTopLevelImpact()
	 * @see #getNotification()
	 * @generated
	 */
	EReference getNotification_TopLevelImpact();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.ma.saga.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable Element</em>'.
	 * @see de.unistuttgart.ma.saga.IdentifiableElement
	 * @generated
	 */
	EClass getIdentifiableElement();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.ma.saga.IdentifiableElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.unistuttgart.ma.saga.IdentifiableElement#getId()
	 * @see #getIdentifiableElement()
	 * @generated
	 */
	EAttribute getIdentifiableElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.ma.saga.IdentifiableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.unistuttgart.ma.saga.IdentifiableElement#getName()
	 * @see #getIdentifiableElement()
	 * @generated
	 */
	EAttribute getIdentifiableElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SagaFactory getSagaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.ProjectImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Sagas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__SAGAS = eINSTANCE.getProject_Sagas();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROCESSES = eINSTANCE.getProject_Processes();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__COMPONENTS = eINSTANCE.getProject_Components();

		/**
		 * The meta object literal for the '<em><b>Notifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__NOTIFICATIONS = eINSTANCE.getProject_Notifications();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.ComponentAdapterImpl <em>Component Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.ComponentAdapterImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getComponentAdapter()
		 * @generated
		 */
		EClass COMPONENT_ADAPTER = eINSTANCE.getComponentAdapter();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.ComponentInterfaceAdapterImpl <em>Component Interface Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.ComponentInterfaceAdapterImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getComponentInterfaceAdapter()
		 * @generated
		 */
		EClass COMPONENT_INTERFACE_ADAPTER = eINSTANCE.getComponentInterfaceAdapter();

		/**
		 * The meta object literal for the '<em><b>Next Level Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE_ADAPTER__NEXT_LEVEL_ELEMENTS = eINSTANCE.getComponentInterfaceAdapter_NextLevelElements();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.SagaImpl <em>Saga</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.SagaImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getSaga()
		 * @generated
		 */
		EClass SAGA = eINSTANCE.getSaga();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAGA__STEPS = eINSTANCE.getSaga_Steps();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.SagaStepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.SagaStepImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getSagaStep()
		 * @generated
		 */
		EClass SAGA_STEP = eINSTANCE.getSagaStep();

		/**
		 * The meta object literal for the '<em><b>Next Level Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAGA_STEP__NEXT_LEVEL_ELEMENTS = eINSTANCE.getSagaStep_NextLevelElements();

		/**
		 * The meta object literal for the '<em><b>Next Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAGA_STEP__NEXT_STEP = eINSTANCE.getSagaStep_NextStep();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.ElementWithSLO <em>Element With SLO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.ElementWithSLO
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getElementWithSLO()
		 * @generated
		 */
		EClass ELEMENT_WITH_SLO = eINSTANCE.getElementWithSLO();

		/**
		 * The meta object literal for the '<em><b>Slo Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_WITH_SLO__SLO_RULES = eINSTANCE.getElementWithSLO_SloRules();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.ViolationImpl <em>Violation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.ViolationImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getViolation()
		 * @generated
		 */
		EClass VIOLATION = eINSTANCE.getViolation();

		/**
		 * The meta object literal for the '<em><b>Passing Impacts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIOLATION__PASSING_IMPACTS = eINSTANCE.getViolation_PassingImpacts();

		/**
		 * The meta object literal for the '<em><b>Violated Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIOLATION__VIOLATED_RULE = eINSTANCE.getViolation_ViolatedRule();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.ImpactImpl <em>Impact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.ImpactImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getImpact()
		 * @generated
		 */
		EClass IMPACT = eINSTANCE.getImpact();

		/**
		 * The meta object literal for the '<em><b>Caused By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPACT__CAUSED_BY = eINSTANCE.getImpact_CausedBy();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.ChainLinkImpl <em>Chain Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.ChainLinkImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getChainLink()
		 * @generated
		 */
		EClass CHAIN_LINK = eINSTANCE.getChainLink();

		/**
		 * The meta object literal for the '<em><b>Location Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAIN_LINK__LOCATION_ID = eINSTANCE.getChainLink_LocationId();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.NotificationImpl <em>Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.NotificationImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getNotification()
		 * @generated
		 */
		EClass NOTIFICATION = eINSTANCE.getNotification();

		/**
		 * The meta object literal for the '<em><b>Chainlinks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION__CHAINLINKS = eINSTANCE.getNotification_Chainlinks();

		/**
		 * The meta object literal for the '<em><b>Top Level Impact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION__TOP_LEVEL_IMPACT = eINSTANCE.getNotification_TopLevelImpact();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.ma.saga.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.ma.saga.impl.IdentifiableElementImpl
		 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getIdentifiableElement()
		 * @generated
		 */
		EClass IDENTIFIABLE_ELEMENT = eINSTANCE.getIdentifiableElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_ELEMENT__ID = eINSTANCE.getIdentifiableElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_ELEMENT__NAME = eINSTANCE.getIdentifiableElement_Name();

	}

} //SagaPackage
