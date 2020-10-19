package com.javahacks.urdf.server.urdf.model;

import org.assertj.core.api.Assertions;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;
import org.ros.model.urdf.RobotType;

import static org.assertj.core.api.Assertions.assertThat;
import static org.ros.model.urdf.UrdfFactory.eINSTANCE;

class ModelConverterTest {
    private final ModelConverter modelConverter = new ModelConverter(new ResourceSetImpl());

    @Test
    void globalMaterialsAreFilled() {
        RobotType robotType= eINSTANCE.createRobotType();
        RobotDescription description = modelConverter.mapRobotType(robotType);
        assertThat(description.getColors()).isEmpty();
    }



}


