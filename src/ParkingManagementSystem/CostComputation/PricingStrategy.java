package ParkingManagementSystem.CostComputation;

import ParkingManagementSystem.Eums.DurationType;
import ParkingManagementSystem.VehicleFactory.Vehicle;

public interface PricingStrategy {
    int calculateCost(Vehicle vehicle, int duration, DurationType durationType);
}
