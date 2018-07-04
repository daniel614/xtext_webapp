/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.wappm.wappm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.wappm.wappm.WappmPackage
 * @generated
 */
public interface WappmFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WappmFactory eINSTANCE = org.xtext.example.wappm.wappm.impl.WappmFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Web Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Web Model</em>'.
   * @generated
   */
  WebModel createWebModel();

  /**
   * Returns a new object of class '<em>Hypertext Layer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hypertext Layer</em>'.
   * @generated
   */
  HypertextLayer createHypertextLayer();

  /**
   * Returns a new object of class '<em>Page</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Page</em>'.
   * @generated
   */
  Page createPage();

  /**
   * Returns a new object of class '<em>Static Page</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static Page</em>'.
   * @generated
   */
  StaticPage createStaticPage();

  /**
   * Returns a new object of class '<em>Dynamic Page</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dynamic Page</em>'.
   * @generated
   */
  DynamicPage createDynamicPage();

  /**
   * Returns a new object of class '<em>Detail Page</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Detail Page</em>'.
   * @generated
   */
  DetailPage createDetailPage();

  /**
   * Returns a new object of class '<em>Index Page</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Index Page</em>'.
   * @generated
   */
  IndexPage createIndexPage();

  /**
   * Returns a new object of class '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Link</em>'.
   * @generated
   */
  Link createLink();

  /**
   * Returns a new object of class '<em>Content Layer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Content Layer</em>'.
   * @generated
   */
  ContentLayer createContentLayer();

  /**
   * Returns a new object of class '<em>Web Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Web Class</em>'.
   * @generated
   */
  WebClass createWebClass();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  WappmPackage getWappmPackage();

} //WappmFactory
