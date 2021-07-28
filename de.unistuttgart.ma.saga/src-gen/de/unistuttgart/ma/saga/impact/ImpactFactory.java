/**
 */
package de.unistuttgart.ma.saga.impact;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.unistuttgart.ma.saga.impact.ImpactPackage
 * @generated
 */
public interface ImpactFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ImpactFactory eINSTANCE = de.unistuttgart.ma.saga.impact.impl.ImpactFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Intermediate Impact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediate Impact</em>'.
	 * @generated
	 */
	IntermediateImpact createIntermediateImpact();

	/**
	 * Returns a new object of class '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification</em>'.
	 * @generated
	 */
	Notification createNotification();

	/**
	 * Returns a new object of class '<em>Violation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Violation</em>'.
	 * @generated
	 */
	Violation createViolation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ImpactPackage getImpactPackage();

} //ImpactFactory
