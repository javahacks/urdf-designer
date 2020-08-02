package org.ros.urdf.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.ros.model.urdf.Joint;
import org.ros.model.urdf.Link;
import org.ros.model.urdf.MaterialGlobal;

public class DslNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	private static final String JOINT_PREFIX = "joint";
	private static final String MATERIAL_PREFIX = "material";
	private static final String LINK_PREFIX = "link";

	/**
	 * Prefix qualified names in order to get some extra type information in LSP clients. 
	 */
	@Override
	protected QualifiedName computeFullyQualifiedName(EObject obj) {
		if (obj instanceof Link) {
			return createQualifiedName(LINK_PREFIX).append(createQualifiedName(((Link) obj).getName()));			
		}
		if (obj instanceof MaterialGlobal) {
			return createQualifiedName(MATERIAL_PREFIX).append(createQualifiedName(((MaterialGlobal) obj).getName()));
		}
		if (obj instanceof Joint) {
			return createQualifiedName(JOINT_PREFIX).append(createQualifiedName(((Joint) obj).getName()));
		}

		return super.computeFullyQualifiedName(obj);

	}

	private QualifiedName createQualifiedName(String name) {
		return name != null ? QualifiedName.create(name) : QualifiedName.EMPTY;
	}

}
