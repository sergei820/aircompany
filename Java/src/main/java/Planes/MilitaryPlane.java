package Planes;

import models.MilitaryPlaneTypes;

import java.util.Objects;

public class MilitaryPlane extends Plane{

    private MilitaryPlaneTypes planeType;

    public MilitaryPlane(String modelName, int planeMaxSpeed, int planeMaxFlightDistance, int planeMaxLoadCapacity, MilitaryPlaneTypes planeType) {
        super(modelName, planeMaxSpeed, planeMaxFlightDistance, planeMaxLoadCapacity);
        this.planeType = planeType;
    }

    public MilitaryPlaneTypes getPlaneType() {
        return planeType;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + planeType +
                '}');
    }

    @Override
    public boolean equals(Object comparedPlane) {
        if (super.equals(comparedPlane)) return true;
        MilitaryPlane militaryPlane = (MilitaryPlane) comparedPlane;
        return planeType == militaryPlane.planeType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), planeType);
    }
}
