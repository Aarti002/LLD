package ParkingManagementSystem.ParkingSpotManager;

import ParkingManagementSystem.Eums.VehicleType;
import ParkingManagementSystem.ParkingSpot.ParkingSpot;
import ParkingManagementSystem.VehicleFactory.Vehicle;

import java.util.List;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpace;

    public ParkingSpotManager(List<ParkingSpot> availableSpace) {
        this.parkingSpace = availableSpace;
    }

    public ParkingSpot findAvailableSpot(VehicleType vehicleType) {
        for(ParkingSpot spot: parkingSpace) {
            if(!spot.isOccupied() && spot.getVehicleType().equals(vehicleType)) {
                return spot;
            }
        }
        System.out.println("Parking Full.");
        return null;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = findAvailableSpot(vehicle.getVehicleType());
        if(spot!=null) {
            spot.parkVehicle(vehicle);
            System.out.println("Your "+vehicle.getVehicleType()+" parked at "+spot.getSpotId());
            return spot;
        }
        System.out.println("No parking space available.");
        return null;
    }

    public void removeVehicle(ParkingSpot spot, Vehicle vehicle) {
        if(spot!=null && spot.isOccupied() && spot.getVehicle().equals(vehicle)) {
            spot.vacateSpot();
            System.out.println(spot.getSpotId() + " is now available.");
        } else {
            throw new IllegalArgumentException("Can't vacate this spot.");
        }
    }

    public ParkingSpot getSpotByNumber(String vehicleNum) {
        for(ParkingSpot spot: parkingSpace) {
            if(spot.getVehicle() == null) {
                continue;
            }

            if(spot.getVehicle().getVehicleNumber() == vehicleNum) {
                return spot;
            }
        }
        return null;
    }
}
