/**
 */
package de.unistuttgart.ma.saga;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.Component#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.ma.saga.SagaPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends ElementWithSLO {
	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link de.unistuttgart.ma.saga.ComponentInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see de.unistuttgart.ma.saga.SagaPackage#getComponent_Interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentInterface> getInterfaces();

} // Component
