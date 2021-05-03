package Planes;

import java.util.Objects;

abstract public class Plane {
    String modelName;
    private int planeMaxSpeed;
    private int planeMaxFlightDistance;
    private int planeMaxLoadCapacity;

    public Plane(String modelName, int planeMaxSpeed, int planeMaxFlightDistance, int planeMaxLoadCapacity) {
        this.modelName = modelName;
        this.planeMaxSpeed = planeMaxSpeed;
        this.planeMaxFlightDistance = planeMaxFlightDistance;
        this.planeMaxLoadCapacity = planeMaxLoadCapacity;
    }

    public String getModelName() {
        return modelName;
    }

    public int getPlaneMaxSpeed() {
        return planeMaxSpeed;
    }

    public int getPlaneMaxFlightDistance() {
        return planeMaxFlightDistance;
    }

    public int getPlaneMaxLoadCapacity() {
        return this.planeMaxLoadCapacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + modelName + '\'' +
                ", maxSpeed=" + planeMaxSpeed +
                ", maxFlightDistance=" + planeMaxFlightDistance +
                ", maxLoadCapacity=" + planeMaxLoadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object comparedPlane) {
        if (this == comparedPlane) return true;
        if (comparedPlane instanceof Plane) return false;
        Plane plane = (Plane) comparedPlane;
        return planeMaxSpeed == plane.planeMaxSpeed &&
                planeMaxFlightDistance == plane.planeMaxFlightDistance &&
                planeMaxLoadCapacity == plane.planeMaxLoadCapacity &&
                Objects.equals(modelName, plane.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, planeMaxSpeed, planeMaxFlightDistance, planeMaxLoadCapacity);
    }
}
