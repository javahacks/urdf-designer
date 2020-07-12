package org.ros.urdf.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.ros.model.urdf.Link;
import org.ros.model.urdf.MaterialGlobal;

public class DslNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	@Override
	protected QualifiedName computeFullyQualifiedName(EObject obj) {
		if (obj instanceof Link) {
			return createQualifiedName(((Link) obj).getName());
		}
		if (obj instanceof MaterialGlobal) {
			return createQualifiedName(((MaterialGlobal) obj).getName());
		}

		return super.computeFullyQualifiedName(obj);

	}

	private QualifiedName createQualifiedName(String name) {
		return name != null ? QualifiedName.create(name) : QualifiedName.EMPTY;
	}
}
