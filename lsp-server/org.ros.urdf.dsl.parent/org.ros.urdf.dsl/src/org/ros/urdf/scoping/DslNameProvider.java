package org.ros.urdf.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.ros.model.urdf.Joint;
import org.ros.model.urdf.Link;
import org.ros.model.urdf.MaterialGlobal;

public class DslNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	@Override
	protected QualifiedName computeFullyQualifiedName(EObject obj) {
		if (obj instanceof Link) {
			return createQualifiedName("link").append(createQualifiedName(((Link) obj).getName()));
			
		}
		if (obj instanceof MaterialGlobal) {
			return createQualifiedName("material").append(createQualifiedName(((MaterialGlobal) obj).getName()));
		}
		if (obj instanceof Joint) {
			return createQualifiedName("joint").append(createQualifiedName(((Joint) obj).getName()));
		}

		return super.computeFullyQualifiedName(obj);

	}

	private QualifiedName createQualifiedName(String name) {
		return name != null ? QualifiedName.create(name) : QualifiedName.EMPTY;
	}

}
