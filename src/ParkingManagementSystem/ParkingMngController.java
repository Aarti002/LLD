package ParkingManagementSystem;

import ParkingManagementSystem.CostComputation.ConcretePricingStrategy.HourlyPricingStrategy;
import ParkingManagementSystem.CostComputation.PricingStrategy;
import ParkingManagementSystem.EntranceGate.EntranceGateManager;
import ParkingManagementSystem.Eums.VehicleType;
import ParkingManagementSystem.ExitGate.ExitGateManager;
import ParkingManagementSystem.ParkingSpot.ConcreteParkingSpot.FourWheelerParkingSpot;
import ParkingManagementSystem.ParkingSpot.ConcreteParkingSpot.TwoWheelerParkingSpot;
import ParkingManagementSystem.ParkingSpot.ParkingSpot;
import ParkingManagementSystem.ParkingSpotManager.ParkingSpotManager;
import ParkingManagementSystem.TicketHandler.Ticket;
import ParkingManagementSystem.VehicleFactory.Vehicle;
import ParkingManagementSystem.VehicleFactory.VehicleFactory;

import java.util.ArrayList;
import java.util.List;

public class ParkingMngController {
    public static void main(String[] args) {
        List<ParkingSpot> parkingSpotList = new ArrayList<>();

        Vehicle bike1 = VehicleFactory.createVehicle(VehicleType.BIKE, "123-456");
        Vehicle bike2 = VehicleFactory.createVehicle(VehicleType.BIKE, "121-454");

        Vehicle car1 = VehicleFactory.createVehicle(VehicleType.CAR, "122-455");
        Vehicle car2 = VehicleFactory.createVehicle(VehicleType.CAR, "113-466");

        parkingSpotList.add(new TwoWheelerParkingSpot(1, VehicleType.BIKE));
        parkingSpotList.add(new TwoWheelerParkingSpot(2, VehicleType.BIKE));
        parkingSpotList.add(new FourWheelerParkingSpot(3, VehicleType.CAR));
        parkingSpotList.add(new FourWheelerParkingSpot(4, VehicleType.CAR));

        ParkingSpotManager parkingSpotManager = new ParkingSpotManager(parkingSpotList);
        EntranceGateManager car1AtEntryGate = new EntranceGateManager(car1, parkingSpotManager);
        Ticket ticketForCar1 = car1AtEntryGate.generateTicket();
        PricingStrategy hourlyPricing = new HourlyPricingStrategy();
        ExitGateManager exitGateForCars = new ExitGateManager(car1, ticketForCar1, parkingSpotManager, hourlyPricing);

        EntranceGateManager car2AtEntryGate = new EntranceGateManager(car2, parkingSpotManager);

        EntranceGateManager bike1AtEntryGate = new EntranceGateManager(bike1, parkingSpotManager);
        Ticket ticketForBike1 = bike1AtEntryGate.generateTicket();
        ExitGateManager exitGateFoeBikes = new ExitGateManager(bike1, ticketForBike1, parkingSpotManager, hourlyPricing);

        EntranceGateManager bike2AtEntryGate = new EntranceGateManager(bike2, parkingSpotManager);
    }
}
