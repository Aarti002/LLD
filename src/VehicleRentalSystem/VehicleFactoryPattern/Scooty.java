package VehicleRentalSystem.VehicleFactoryPattern;

import VehicleRentalSystem.Enums.VehicleType;

public class Scooty extends NewVehicle {
    Scooty(VehicleType type) {
        super(type);
    }

    @Override
    public int getCharge() {
        return 700;
    }

    @Override
    public int getDamageCharge() {
        return 350;
    }
}
