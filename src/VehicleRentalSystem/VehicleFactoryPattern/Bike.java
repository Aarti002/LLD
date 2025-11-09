package VehicleRentalSystem.VehicleFactoryPattern;

import VehicleRentalSystem.Enums.VehicleType;

public class Bike extends NewVehicle {
    Bike(VehicleType type) {
        super(type);
    }

    @Override
    public int getCharge() {
        return 1000;
    }

    @Override
    public int getDamageCharge() {
        return 550;
    }
}
