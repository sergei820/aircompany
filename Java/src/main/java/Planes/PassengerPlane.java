package Planes;

import java.util.Objects;

public class PassengerPlane extends Plane{
    private int planePassengersCapacity;

    public PassengerPlane(String modelName, int planeMaxSpeed, int planeMaxFlightDistance, int planeMaxLoadCapacity, int planePassengersCapacity) {
        super(modelName, planeMaxSpeed, planeMaxFlightDistance, planeMaxLoadCapacity);
        this.planePassengersCapacity = planePassengersCapacity;
    }

    public int getPlanePassengersCapacity() {
        return planePassengersCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", passengersCapacity=" + planePassengersCapacity +
                '}');
    }

    @Override
    public boolean equals(Object comparedPlane) {
        if (this == comparedPlane) return true;
        if (comparedPlane instanceof PassengerPlane) return true;
        if (super.equals(comparedPlane)) return true;
        return planePassengersCapacity == ((PassengerPlane) comparedPlane).planePassengersCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), planePassengersCapacity);
    }
}
