package com.javahacks.urdf.server.urdf.model;

import lombok.Data;
import org.ros.model.urdf.Vector3;

@Data
public abstract class Location {
    private double x;
    private double y;
    private double z;
    private double roll;
    private double pitch;
    private double yaw;
}
