package VehicleRentalSystem.VehicleFactoryPattern;

import VehicleRentalSystem.Enums.VehicleType;

public abstract class Vehicle {
    public abstract NewVehicle createVehicle(VehicleType type);
}
