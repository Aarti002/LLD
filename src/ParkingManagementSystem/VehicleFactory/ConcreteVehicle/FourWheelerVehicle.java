package ParkingManagementSystem.VehicleFactory.ConcreteVehicle;

import ParkingManagementSystem.Eums.VehicleType;
import ParkingManagementSystem.VehicleFactory.Vehicle;

public class FourWheelerVehicle extends Vehicle {
    public FourWheelerVehicle(String vehicleNum, VehicleType type) {
        super(vehicleNum, type);
    }
}
