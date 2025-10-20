package ParkingManagementSystem.ParkingSpot.ConcreteParkingSpot;

import ParkingManagementSystem.Eums.VehicleType;
import ParkingManagementSystem.ParkingSpot.ParkingSpot;
import ParkingManagementSystem.VehicleFactory.Vehicle;

public class FourWheelerParkingSpot extends ParkingSpot {
    public FourWheelerParkingSpot(int spotId, VehicleType vehicleType) {
        super(spotId, vehicleType);
    }

    @Override
    public boolean canParkThisVehicle(Vehicle vehicle) {
        if(vehicle.getVehicleType().equals(VehicleType.CAR)){
            return true;
        }
        return false;
    }
}
