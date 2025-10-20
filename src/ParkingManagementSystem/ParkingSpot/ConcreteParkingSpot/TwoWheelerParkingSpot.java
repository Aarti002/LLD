package ParkingManagementSystem.ParkingSpot.ConcreteParkingSpot;

import ParkingManagementSystem.Eums.VehicleType;
import ParkingManagementSystem.ParkingSpot.ParkingSpot;
import ParkingManagementSystem.VehicleFactory.Vehicle;

public class TwoWheelerParkingSpot extends ParkingSpot {
    public TwoWheelerParkingSpot(int spotId, VehicleType vehicleType) {
        super(spotId, vehicleType);
    }

    @Override
    public boolean canParkThisVehicle(Vehicle vehicle) {
        if(vehicle.getVehicleType().equals(VehicleType.BIKE)){
            return true;
        }
        return false;
    }
}
