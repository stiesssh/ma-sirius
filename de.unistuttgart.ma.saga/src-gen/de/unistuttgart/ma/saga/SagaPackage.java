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
	int IDENTIFIABLE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_FEATURE_COUNT = 1;

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
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.ma.saga.impl.SagaImpl <em>Saga</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.ma.saga.impl.SagaImpl
	 * @see de.unistuttgart.ma.saga.impl.SagaPackageImpl#getSaga()
	 * @generated
	 */
	int SAGA = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA__ID = IDENTIFIABLE_ELEMENT__ID;

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
	int SAGA_STEP = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_STEP__ID = IDENTIFIABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_STEP__TASK = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_STEP__NEXT_STEP = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_STEP__COMPONENT_INTERFACE = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_STEP_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGA_STEP_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the reference '{@link de.unistuttgart.ma.saga.SagaStep#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see de.unistuttgart.ma.saga.SagaStep#getTask()
	 * @see #getSagaStep()
	 * @generated
	 */
	EReference getSagaStep_Task();

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
	 * Returns the meta object for the reference '{@link de.unistuttgart.ma.saga.SagaStep#getComponentInterface <em>Component Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Interface</em>'.
	 * @see de.unistuttgart.ma.saga.SagaStep#getComponentInterface()
	 * @see #getSagaStep()
	 * @generated
	 */
	EReference getSagaStep_ComponentInterface();

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
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAGA_STEP__TASK = eINSTANCE.getSagaStep_Task();

		/**
		 * The meta object literal for the '<em><b>Next Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAGA_STEP__NEXT_STEP = eINSTANCE.getSagaStep_NextStep();

		/**
		 * The meta object literal for the '<em><b>Component Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAGA_STEP__COMPONENT_INTERFACE = eINSTANCE.getSagaStep_ComponentInterface();

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

	}

} //SagaPackage
