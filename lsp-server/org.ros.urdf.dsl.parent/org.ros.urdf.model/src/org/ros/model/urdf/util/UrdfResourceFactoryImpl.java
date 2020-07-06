/**
 */
package org.ros.model.urdf.util;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.ros.model.urdf.UrdfPackage;

/**
 * <!-- begin-user-doc --> The <b>Resource Factory</b> associated with the
 * package. <!-- end-user-doc -->
 * @see org.ros.model.urdf.util.UrdfResourceImpl
 * @generated
 */
public class UrdfResourceFactoryImpl extends ResourceFactoryImpl {
	private final ExtendedMetaData extendeMedadata = createMetadata();

	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public UrdfResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Resource createResource(final URI uri) {
		final XMLResource result = new UrdfResourceImpl(uri);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendeMedadata);
		result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendeMedadata);

		result.getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.FALSE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		result.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

		result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
		return result;
	}

	private ExtendedMetaData createMetadata() {
		final ExtendedMetaData ext = new BasicExtendedMetaData(ExtendedMetaData.ANNOTATION_URI, EPackage.Registry.INSTANCE,
				new HashMap<EModelElement, EAnnotation>()) {
			@Override
			public EPackage getPackage(final String namespace) {
				if (namespace == null) {
					return UrdfPackage.eINSTANCE;
				}
				return super.getPackage(namespace);

			}

			@Override
			protected boolean isFeatureNamespaceMatchingLax() {
				return true;
			}
		};

		
		ext.setQualified(UrdfPackage.eINSTANCE, false);
		return ext;
	}

} // UrdfResourceFactoryImpl
