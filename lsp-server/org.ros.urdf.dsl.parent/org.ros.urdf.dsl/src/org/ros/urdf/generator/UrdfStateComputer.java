package org.ros.urdf.generator;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.ros.model.urdf.Axis;
import org.ros.model.urdf.Box;
import org.ros.model.urdf.Color;
import org.ros.model.urdf.Mesh;
import org.ros.model.urdf.Pose;
import org.ros.model.urdf.Vector3;
import org.ros.model.urdf.Vector4;

public class UrdfStateComputer implements IDerivedStateComputer{

	@Override
	public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
		if(!preLinkingPhase) {
			EcoreUtil2.getAllContents(resource, true).forEachRemaining(this::setDerivedState);;			
		}
	}

	private void setDerivedState(final Object object) {
		
		if(object instanceof Pose) {
			final Pose pose= (Pose) object;			
			final Vector3 xyz = pose.getXyzVector();
			final Vector3 rpY = pose.getRpyVector();
			pose.setRpy(rpY!=null?rpY.toString():null);
			pose.setXyz(xyz!=null?xyz.toString():null);
		}
		if(object instanceof Color) {
			final Color color= (Color) object;			
			final Vector4 colorVec = color.getColor();					
			color.setRgba(colorVec!=null?colorVec.toString():null);
		}
		if(object instanceof Box) {
			final Box box= (Box) object;			
			final Vector3 dimension = box.getDimension();					
			box.setSize(dimension!=null?dimension.toString():null);
		}

		if(object instanceof Mesh) {
			final Mesh mesh= (Mesh) object;			
			final Vector3 scaleVector= mesh.getScaleVector();					
			mesh.setScale(scaleVector!=null?scaleVector.toString():null);
		}
		
		if(object instanceof Axis) {
			final Axis axis= (Axis) object;			
			final Vector3 vector= axis.getXyzVector();					
			axis.setXyz(vector!=null?vector.toString():null);
		}		
		
	}
	
	
	@Override
	public void discardDerivedState(final DerivedStateAwareResource resource) {
		//nothing to discard
	}

}
