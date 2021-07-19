/**
 */
package de.unistuttgart.gropius.slo.impl;

import de.unistuttgart.gropius.slo.Alert;
import de.unistuttgart.gropius.slo.SloPackage;
import de.unistuttgart.gropius.slo.SloRule;
import de.unistuttgart.gropius.slo.solomon;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>solomon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.slo.impl.solomonImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.impl.solomonImpl#getAlerts <em>Alerts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class solomonImpl extends MinimalEObjectImpl.Container implements solomon {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<SloRule> rules;

	/**
	 * The cached value of the '{@link #getAlerts() <em>Alerts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlerts()
	 * @generated
	 * @ordered
	 */
	protected EList<Alert> alerts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected solomonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SloPackage.Literals.SOLOMON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SloRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<SloRule>(SloRule.class, this, SloPackage.SOLOMON__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Alert> getAlerts() {
		if (alerts == null) {
			alerts = new EObjectContainmentEList<Alert>(Alert.class, this, SloPackage.SOLOMON__ALERTS);
		}
		return alerts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SloPackage.SOLOMON__RULES:
			return ((InternalEList<?>) getRules()).basicRemove(otherEnd, msgs);
		case SloPackage.SOLOMON__ALERTS:
			return ((InternalEList<?>) getAlerts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SloPackage.SOLOMON__RULES:
			return getRules();
		case SloPackage.SOLOMON__ALERTS:
			return getAlerts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SloPackage.SOLOMON__RULES:
			getRules().clear();
			getRules().addAll((Collection<? extends SloRule>) newValue);
			return;
		case SloPackage.SOLOMON__ALERTS:
			getAlerts().clear();
			getAlerts().addAll((Collection<? extends Alert>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SloPackage.SOLOMON__RULES:
			getRules().clear();
			return;
		case SloPackage.SOLOMON__ALERTS:
			getAlerts().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SloPackage.SOLOMON__RULES:
			return rules != null && !rules.isEmpty();
		case SloPackage.SOLOMON__ALERTS:
			return alerts != null && !alerts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //solomonImpl
