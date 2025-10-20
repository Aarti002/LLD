package ParkingManagementSystem.VehicleFactory;

import ParkingManagementSystem.Eums.VehicleType;

public abstract class Vehicle {
    private final String vehicleNumber;
    private final VehicleType vehicleType;

    protected Vehicle(String num, VehicleType type) {
        this.vehicleNumber = num;
        this.vehicleType = type;
    }

    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }
}
