package VehicleRentalSystem.VehicleFactoryPattern;

import VehicleRentalSystem.Enums.VehicleType;

public class VehicleFactory extends Vehicle {
    @Override
    public NewVehicle createVehicle(VehicleType type) {
        switch (type) {
            case CAR -> {
                return new Car(VehicleType.CAR);
            }
            case BIKE -> {
                return new Bike(VehicleType.BIKE);
            }
            case SCOOTY -> {
                return new Scooty(VehicleType.SCOOTY);
            }
            default -> {
                return null;
            }
        }
    }
}
