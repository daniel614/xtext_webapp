/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.wappm.wappm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.wappm.wappm.URL;
import org.xtext.example.wappm.wappm.URL_ADDITION;
import org.xtext.example.wappm.wappm.WappmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.wappm.wappm.impl.URLImpl#getAddition <em>Addition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class URLImpl extends MinimalEObjectImpl.Container implements URL
{
  /**
   * The cached value of the '{@link #getAddition() <em>Addition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddition()
   * @generated
   * @ordered
   */
  protected EList<URL_ADDITION> addition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected URLImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WappmPackage.Literals.URL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<URL_ADDITION> getAddition()
  {
    if (addition == null)
    {
      addition = new EObjectContainmentEList<URL_ADDITION>(URL_ADDITION.class, this, WappmPackage.URL__ADDITION);
    }
    return addition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WappmPackage.URL__ADDITION:
        return ((InternalEList<?>)getAddition()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WappmPackage.URL__ADDITION:
        return getAddition();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WappmPackage.URL__ADDITION:
        getAddition().clear();
        getAddition().addAll((Collection<? extends URL_ADDITION>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WappmPackage.URL__ADDITION:
        getAddition().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WappmPackage.URL__ADDITION:
        return addition != null && !addition.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //URLImpl
