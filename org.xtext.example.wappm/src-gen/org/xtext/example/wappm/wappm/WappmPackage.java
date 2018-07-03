/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.wappm.wappm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.wappm.wappm.WappmFactory
 * @model kind="package"
 * @generated
 */
public interface WappmPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "wappm";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/wappm/Wappm";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "wappm";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WappmPackage eINSTANCE = org.xtext.example.wappm.wappm.impl.WappmPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.wappm.wappm.impl.WebModelImpl <em>Web Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wappm.wappm.impl.WebModelImpl
   * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getWebModel()
   * @generated
   */
  int WEB_MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Hypertext</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODEL__HYPERTEXT = 1;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODEL__CONTENT = 2;

  /**
   * The number of structural features of the '<em>Web Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.wappm.wappm.impl.HypertextLayerImpl <em>Hypertext Layer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wappm.wappm.impl.HypertextLayerImpl
   * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getHypertextLayer()
   * @generated
   */
  int HYPERTEXT_LAYER = 1;

  /**
   * The feature id for the '<em><b>Hyper Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPERTEXT_LAYER__HYPER_NAME = 0;

  /**
   * The feature id for the '<em><b>Pages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPERTEXT_LAYER__PAGES = 1;

  /**
   * The number of structural features of the '<em>Hypertext Layer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HYPERTEXT_LAYER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.wappm.wappm.impl.PageImpl <em>Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wappm.wappm.impl.PageImpl
   * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getPage()
   * @generated
   */
  int PAGE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__URL = 1;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__LINKS = 2;

  /**
   * The number of structural features of the '<em>Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.wappm.wappm.impl.StaticPageImpl <em>Static Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wappm.wappm.impl.StaticPageImpl
   * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getStaticPage()
   * @generated
   */
  int STATIC_PAGE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PAGE__NAME = PAGE__NAME;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PAGE__URL = PAGE__URL;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PAGE__LINKS = PAGE__LINKS;

  /**
   * The number of structural features of the '<em>Static Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.wappm.wappm.impl.DynamicPageImpl <em>Dynamic Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wappm.wappm.impl.DynamicPageImpl
   * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getDynamicPage()
   * @generated
   */
  int DYNAMIC_PAGE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PAGE__NAME = PAGE__NAME;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PAGE__URL = PAGE__URL;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PAGE__LINKS = PAGE__LINKS;

  /**
   * The feature id for the '<em><b>Displayed Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PAGE__DISPLAYED_CLASS = PAGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dynamic Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.wappm.wappm.impl.DetailPageImpl <em>Detail Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wappm.wappm.impl.DetailPageImpl
   * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getDetailPage()
   * @generated
   */
  int DETAIL_PAGE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAIL_PAGE__NAME = DYNAMIC_PAGE__NAME;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAIL_PAGE__URL = DYNAMIC_PAGE__URL;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAIL_PAGE__LINKS = DYNAMIC_PAGE__LINKS;

  /**
   * The feature id for the '<em><b>Displayed Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAIL_PAGE__DISPLAYED_CLASS = DYNAMIC_PAGE__DISPLAYED_CLASS;

  /**
   * The number of structural features of the '<em>Detail Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DETAIL_PAGE_FEATURE_COUNT = DYNAMIC_PAGE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.wappm.wappm.impl.IndexPageImpl <em>Index Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wappm.wappm.impl.IndexPageImpl
   * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getIndexPage()
   * @generated
   */
  int INDEX_PAGE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_PAGE__NAME = DYNAMIC_PAGE__NAME;

  /**
   * The feature id for the '<em><b>Url</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_PAGE__URL = DYNAMIC_PAGE__URL;

  /**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_PAGE__LINKS = DYNAMIC_PAGE__LINKS;

  /**
   * The feature id for the '<em><b>Displayed Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_PAGE__DISPLAYED_CLASS = DYNAMIC_PAGE__DISPLAYED_CLASS;

  /**
   * The number of structural features of the '<em>Index Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDEX_PAGE_FEATURE_COUNT = DYNAMIC_PAGE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.wappm.wappm.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wappm.wappm.impl.LinkImpl
   * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getLink()
   * @generated
   */
  int LINK = 7;

  /**
   * The feature id for the '<em><b>Page</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__PAGE = 0;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.wappm.wappm.impl.ContentLayerImpl <em>Content Layer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wappm.wappm.impl.ContentLayerImpl
   * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getContentLayer()
   * @generated
   */
  int CONTENT_LAYER = 8;

  /**
   * The feature id for the '<em><b>Content Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_LAYER__CONTENT_NAME = 0;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_LAYER__CLASSES = 1;

  /**
   * The number of structural features of the '<em>Content Layer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_LAYER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.wappm.wappm.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wappm.wappm.impl.ClassImpl
   * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Unique Identifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__UNIQUE_IDENTIFIER = 2;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.wappm.wappm.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wappm.wappm.impl.AttributeImpl
   * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.wappm.wappm.impl.URLImpl <em>URL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wappm.wappm.impl.URLImpl
   * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getURL()
   * @generated
   */
  int URL = 11;

  /**
   * The feature id for the '<em><b>Addition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL__ADDITION = 0;

  /**
   * The number of structural features of the '<em>URL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.wappm.wappm.impl.URL_ADDITIONImpl <em>URL ADDITION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wappm.wappm.impl.URL_ADDITIONImpl
   * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getURL_ADDITION()
   * @generated
   */
  int URL_ADDITION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_ADDITION__NAME = 0;

  /**
   * The number of structural features of the '<em>URL ADDITION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_ADDITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.wappm.wappm.AppTypes <em>App Types</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.wappm.wappm.AppTypes
   * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getAppTypes()
   * @generated
   */
  int APP_TYPES = 13;


  /**
   * Returns the meta object for class '{@link org.xtext.example.wappm.wappm.WebModel <em>Web Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Web Model</em>'.
   * @see org.xtext.example.wappm.wappm.WebModel
   * @generated
   */
  EClass getWebModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wappm.wappm.WebModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.wappm.wappm.WebModel#getName()
   * @see #getWebModel()
   * @generated
   */
  EAttribute getWebModel_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.wappm.wappm.WebModel#getHypertext <em>Hypertext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Hypertext</em>'.
   * @see org.xtext.example.wappm.wappm.WebModel#getHypertext()
   * @see #getWebModel()
   * @generated
   */
  EReference getWebModel_Hypertext();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.wappm.wappm.WebModel#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Content</em>'.
   * @see org.xtext.example.wappm.wappm.WebModel#getContent()
   * @see #getWebModel()
   * @generated
   */
  EReference getWebModel_Content();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wappm.wappm.HypertextLayer <em>Hypertext Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hypertext Layer</em>'.
   * @see org.xtext.example.wappm.wappm.HypertextLayer
   * @generated
   */
  EClass getHypertextLayer();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wappm.wappm.HypertextLayer#getHyperName <em>Hyper Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hyper Name</em>'.
   * @see org.xtext.example.wappm.wappm.HypertextLayer#getHyperName()
   * @see #getHypertextLayer()
   * @generated
   */
  EAttribute getHypertextLayer_HyperName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.wappm.wappm.HypertextLayer#getPages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pages</em>'.
   * @see org.xtext.example.wappm.wappm.HypertextLayer#getPages()
   * @see #getHypertextLayer()
   * @generated
   */
  EReference getHypertextLayer_Pages();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wappm.wappm.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page</em>'.
   * @see org.xtext.example.wappm.wappm.Page
   * @generated
   */
  EClass getPage();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wappm.wappm.Page#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.wappm.wappm.Page#getName()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.wappm.wappm.Page#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Url</em>'.
   * @see org.xtext.example.wappm.wappm.Page#getUrl()
   * @see #getPage()
   * @generated
   */
  EReference getPage_Url();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.wappm.wappm.Page#getLinks <em>Links</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Links</em>'.
   * @see org.xtext.example.wappm.wappm.Page#getLinks()
   * @see #getPage()
   * @generated
   */
  EReference getPage_Links();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wappm.wappm.StaticPage <em>Static Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Page</em>'.
   * @see org.xtext.example.wappm.wappm.StaticPage
   * @generated
   */
  EClass getStaticPage();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wappm.wappm.DynamicPage <em>Dynamic Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dynamic Page</em>'.
   * @see org.xtext.example.wappm.wappm.DynamicPage
   * @generated
   */
  EClass getDynamicPage();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.wappm.wappm.DynamicPage#getDisplayedClass <em>Displayed Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Displayed Class</em>'.
   * @see org.xtext.example.wappm.wappm.DynamicPage#getDisplayedClass()
   * @see #getDynamicPage()
   * @generated
   */
  EReference getDynamicPage_DisplayedClass();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wappm.wappm.DetailPage <em>Detail Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Detail Page</em>'.
   * @see org.xtext.example.wappm.wappm.DetailPage
   * @generated
   */
  EClass getDetailPage();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wappm.wappm.IndexPage <em>Index Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Index Page</em>'.
   * @see org.xtext.example.wappm.wappm.IndexPage
   * @generated
   */
  EClass getIndexPage();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wappm.wappm.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see org.xtext.example.wappm.wappm.Link
   * @generated
   */
  EClass getLink();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.wappm.wappm.Link#getPage <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Page</em>'.
   * @see org.xtext.example.wappm.wappm.Link#getPage()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Page();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wappm.wappm.ContentLayer <em>Content Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Layer</em>'.
   * @see org.xtext.example.wappm.wappm.ContentLayer
   * @generated
   */
  EClass getContentLayer();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wappm.wappm.ContentLayer#getContentName <em>Content Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content Name</em>'.
   * @see org.xtext.example.wappm.wappm.ContentLayer#getContentName()
   * @see #getContentLayer()
   * @generated
   */
  EAttribute getContentLayer_ContentName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.wappm.wappm.ContentLayer#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see org.xtext.example.wappm.wappm.ContentLayer#getClasses()
   * @see #getContentLayer()
   * @generated
   */
  EReference getContentLayer_Classes();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wappm.wappm.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see org.xtext.example.wappm.wappm.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wappm.wappm.Class#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.wappm.wappm.Class#getName()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.wappm.wappm.Class#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.example.wappm.wappm.Class#getAttributes()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Attributes();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.wappm.wappm.Class#getUniqueIdentifier <em>Unique Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Unique Identifier</em>'.
   * @see org.xtext.example.wappm.wappm.Class#getUniqueIdentifier()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_UniqueIdentifier();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wappm.wappm.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.xtext.example.wappm.wappm.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wappm.wappm.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.wappm.wappm.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wappm.wappm.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.wappm.wappm.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wappm.wappm.URL <em>URL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URL</em>'.
   * @see org.xtext.example.wappm.wappm.URL
   * @generated
   */
  EClass getURL();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.wappm.wappm.URL#getAddition <em>Addition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Addition</em>'.
   * @see org.xtext.example.wappm.wappm.URL#getAddition()
   * @see #getURL()
   * @generated
   */
  EReference getURL_Addition();

  /**
   * Returns the meta object for class '{@link org.xtext.example.wappm.wappm.URL_ADDITION <em>URL ADDITION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URL ADDITION</em>'.
   * @see org.xtext.example.wappm.wappm.URL_ADDITION
   * @generated
   */
  EClass getURL_ADDITION();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.wappm.wappm.URL_ADDITION#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.wappm.wappm.URL_ADDITION#getName()
   * @see #getURL_ADDITION()
   * @generated
   */
  EAttribute getURL_ADDITION_Name();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.wappm.wappm.AppTypes <em>App Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>App Types</em>'.
   * @see org.xtext.example.wappm.wappm.AppTypes
   * @generated
   */
  EEnum getAppTypes();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WappmFactory getWappmFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.wappm.wappm.impl.WebModelImpl <em>Web Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wappm.wappm.impl.WebModelImpl
     * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getWebModel()
     * @generated
     */
    EClass WEB_MODEL = eINSTANCE.getWebModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEB_MODEL__NAME = eINSTANCE.getWebModel_Name();

    /**
     * The meta object literal for the '<em><b>Hypertext</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_MODEL__HYPERTEXT = eINSTANCE.getWebModel_Hypertext();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_MODEL__CONTENT = eINSTANCE.getWebModel_Content();

    /**
     * The meta object literal for the '{@link org.xtext.example.wappm.wappm.impl.HypertextLayerImpl <em>Hypertext Layer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wappm.wappm.impl.HypertextLayerImpl
     * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getHypertextLayer()
     * @generated
     */
    EClass HYPERTEXT_LAYER = eINSTANCE.getHypertextLayer();

    /**
     * The meta object literal for the '<em><b>Hyper Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HYPERTEXT_LAYER__HYPER_NAME = eINSTANCE.getHypertextLayer_HyperName();

    /**
     * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HYPERTEXT_LAYER__PAGES = eINSTANCE.getHypertextLayer_Pages();

    /**
     * The meta object literal for the '{@link org.xtext.example.wappm.wappm.impl.PageImpl <em>Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wappm.wappm.impl.PageImpl
     * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getPage()
     * @generated
     */
    EClass PAGE = eINSTANCE.getPage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__URL = eINSTANCE.getPage_Url();

    /**
     * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__LINKS = eINSTANCE.getPage_Links();

    /**
     * The meta object literal for the '{@link org.xtext.example.wappm.wappm.impl.StaticPageImpl <em>Static Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wappm.wappm.impl.StaticPageImpl
     * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getStaticPage()
     * @generated
     */
    EClass STATIC_PAGE = eINSTANCE.getStaticPage();

    /**
     * The meta object literal for the '{@link org.xtext.example.wappm.wappm.impl.DynamicPageImpl <em>Dynamic Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wappm.wappm.impl.DynamicPageImpl
     * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getDynamicPage()
     * @generated
     */
    EClass DYNAMIC_PAGE = eINSTANCE.getDynamicPage();

    /**
     * The meta object literal for the '<em><b>Displayed Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DYNAMIC_PAGE__DISPLAYED_CLASS = eINSTANCE.getDynamicPage_DisplayedClass();

    /**
     * The meta object literal for the '{@link org.xtext.example.wappm.wappm.impl.DetailPageImpl <em>Detail Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wappm.wappm.impl.DetailPageImpl
     * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getDetailPage()
     * @generated
     */
    EClass DETAIL_PAGE = eINSTANCE.getDetailPage();

    /**
     * The meta object literal for the '{@link org.xtext.example.wappm.wappm.impl.IndexPageImpl <em>Index Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wappm.wappm.impl.IndexPageImpl
     * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getIndexPage()
     * @generated
     */
    EClass INDEX_PAGE = eINSTANCE.getIndexPage();

    /**
     * The meta object literal for the '{@link org.xtext.example.wappm.wappm.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wappm.wappm.impl.LinkImpl
     * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getLink()
     * @generated
     */
    EClass LINK = eINSTANCE.getLink();

    /**
     * The meta object literal for the '<em><b>Page</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__PAGE = eINSTANCE.getLink_Page();

    /**
     * The meta object literal for the '{@link org.xtext.example.wappm.wappm.impl.ContentLayerImpl <em>Content Layer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wappm.wappm.impl.ContentLayerImpl
     * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getContentLayer()
     * @generated
     */
    EClass CONTENT_LAYER = eINSTANCE.getContentLayer();

    /**
     * The meta object literal for the '<em><b>Content Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_LAYER__CONTENT_NAME = eINSTANCE.getContentLayer_ContentName();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_LAYER__CLASSES = eINSTANCE.getContentLayer_Classes();

    /**
     * The meta object literal for the '{@link org.xtext.example.wappm.wappm.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wappm.wappm.impl.ClassImpl
     * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__ATTRIBUTES = eINSTANCE.getClass_Attributes();

    /**
     * The meta object literal for the '<em><b>Unique Identifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__UNIQUE_IDENTIFIER = eINSTANCE.getClass_UniqueIdentifier();

    /**
     * The meta object literal for the '{@link org.xtext.example.wappm.wappm.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wappm.wappm.impl.AttributeImpl
     * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.wappm.wappm.impl.URLImpl <em>URL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wappm.wappm.impl.URLImpl
     * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getURL()
     * @generated
     */
    EClass URL = eINSTANCE.getURL();

    /**
     * The meta object literal for the '<em><b>Addition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference URL__ADDITION = eINSTANCE.getURL_Addition();

    /**
     * The meta object literal for the '{@link org.xtext.example.wappm.wappm.impl.URL_ADDITIONImpl <em>URL ADDITION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wappm.wappm.impl.URL_ADDITIONImpl
     * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getURL_ADDITION()
     * @generated
     */
    EClass URL_ADDITION = eINSTANCE.getURL_ADDITION();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL_ADDITION__NAME = eINSTANCE.getURL_ADDITION_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.wappm.wappm.AppTypes <em>App Types</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.wappm.wappm.AppTypes
     * @see org.xtext.example.wappm.wappm.impl.WappmPackageImpl#getAppTypes()
     * @generated
     */
    EEnum APP_TYPES = eINSTANCE.getAppTypes();

  }

} //WappmPackage