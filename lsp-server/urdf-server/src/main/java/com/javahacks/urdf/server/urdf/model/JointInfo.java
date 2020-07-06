package com.javahacks.urdf.server.urdf.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class JointInfo extends Location {

    @NonNull
    private String id;

    @NonNull
    private String type;

    @NonNull
    private String parent;

    @NonNull
    private String child;

    private double axeX;
    private double axeY;
    private double axeZ;

    private double lowerLimit;
    private double upperLimit;

    private double value;

}
