package ParkingManagementSystem.CostComputation.ConcretePricingStrategy;

import ParkingManagementSystem.CostComputation.PricingStrategy;
import ParkingManagementSystem.Eums.DurationType;
import ParkingManagementSystem.Eums.VehicleType;
import ParkingManagementSystem.VehicleFactory.Vehicle;

public class HourlyPricingStrategy implements PricingStrategy {
    @Override
    public int calculateCost(Vehicle vehicle, int duration, DurationType durationType) {
        switch (vehicle.getVehicleType()) {
            case VehicleType.BIKE:
                return durationType == DurationType.HOURLY ? duration * 50 : duration * 50 * 24;
            case VehicleType.CAR:
                return durationType == DurationType.HOURLY ? duration * 100 : duration * 100 * 24;
            default:
                return durationType == DurationType.HOURLY ? duration * 75 : duration * 75 * 24;
        }
    }
}
