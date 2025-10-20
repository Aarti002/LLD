package ParkingManagementSystem.VehicleFactory.ConcreteVehicle;

import ParkingManagementSystem.Eums.VehicleType;
import ParkingManagementSystem.VehicleFactory.Vehicle;

public class TwoWheelerVehicle extends Vehicle {
    public TwoWheelerVehicle(String vehicleNum, VehicleType type) {
        super(vehicleNum, type);
    }
}
