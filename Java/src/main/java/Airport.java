import Planes.ExperimentalPlane;
import models.MilitaryPlaneTypes;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.*;

// version: 1.1
// made by Vitali Shulha
// 4-Jan-2019

public class Airport {
    private List<? extends Plane> airportPlanes;

    public List<PassengerPlane> getPassengerPlanesInAirport() {
        List<PassengerPlane> listOfPassengerPlanesInAirport = new ArrayList<>();
        for (Plane plane : this.airportPlanes) {
            if (plane instanceof PassengerPlane) {
                listOfPassengerPlanesInAirport.add((PassengerPlane) plane);
            }
        }
        return listOfPassengerPlanesInAirport;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : airportPlanes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlanesInAirport();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for(PassengerPlane passengerPlane : passengerPlanes) {
            if (passengerPlane.getPlanePassengersCapacity() > planeWithMaxCapacity.getPlanePassengersCapacity()) {
                planeWithMaxCapacity = passengerPlane;
            }
        }
        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        for(MilitaryPlane militaryPlane : getMilitaryPlanes()) {
            if (militaryPlane.getPlaneType() == MilitaryPlaneTypes.TRANSPORT) {
            transportMilitaryPlanes.add(militaryPlane);
            }
        }
        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        for (MilitaryPlane bomberMilitaryPlane : getMilitaryPlanes()) {
            if (bomberMilitaryPlane.getPlaneType() == MilitaryPlaneTypes.BOMBER) {
                bomberMilitaryPlanes.add(bomberMilitaryPlane);
            }
        }
        return bomberMilitaryPlanes;
    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : airportPlanes) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public Airport sortByMaxDistance() {
        Collections.sort(airportPlanes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getPlaneMaxFlightDistance() - o2.getPlaneMaxFlightDistance();
            }
        });
        return this;
    }

    public Airport sortByMaxSpeed() {
        Collections.sort(airportPlanes, new Comparator<Plane>() {
            public int compare(Plane plane1, Plane plane2) {
                return plane1.getPlaneMaxSpeed() - plane2.getPlaneMaxSpeed();
            }
        });
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        Collections.sort(airportPlanes, new Comparator<Plane>() {
            public int compare(Plane plane1, Plane plane2) {
                return plane1.getPlaneMaxLoadCapacity() - plane2.getPlaneMaxLoadCapacity();
            }
        });
        return this;
    }

    public List<? extends Plane> getAirportPlanes() {
        return airportPlanes;
    }

    private void print(Collection<? extends Plane> collection) {
        Iterator<? extends Plane> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Plane plane = iterator.next();
            System.out.println(plane);
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + airportPlanes.toString() +
                '}';
    }

    public Airport(List<? extends Plane> airportPlanes) {
        this.airportPlanes = airportPlanes;
    }

}
