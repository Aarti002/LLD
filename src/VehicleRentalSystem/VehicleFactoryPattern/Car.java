package VehicleRentalSystem.VehicleFactoryPattern;

import VehicleRentalSystem.Enums.VehicleType;

public class Car extends NewVehicle {
    Car(VehicleType type) {
        super(type);
    }

    @Override
    public int getCharge() {
        return 1500;
    }

    @Override
    public int getDamageCharge() {
        return 850;
    }
}
