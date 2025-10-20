package ParkingManagementSystem.ExitGate;

import ParkingManagementSystem.CostComputation.PricingStrategy;
import ParkingManagementSystem.Eums.DurationType;
import ParkingManagementSystem.ParkingSpot.ParkingSpot;
import ParkingManagementSystem.ParkingSpotManager.ParkingSpotManager;
import ParkingManagementSystem.TicketHandler.Ticket;
import ParkingManagementSystem.VehicleFactory.Vehicle;

public class ExitGateManager {
    Vehicle vehicle;
    ParkingSpotManager spotManager;
    Ticket generatedTicket;
    PricingStrategy pricingStrategy;

    public ExitGateManager(Vehicle vehicle, Ticket generatedTicket, ParkingSpotManager mng, PricingStrategy ps) {
        this.vehicle = vehicle;
        this.spotManager = mng;
        this.generatedTicket = generatedTicket;
        this.pricingStrategy = ps;
        vacateParkingSpot();
        calculateParkingCharge();
    }

    void vacateParkingSpot() {
        System.out.println("Vacating vehicle with vehicle number: "+this.vehicle.getVehicleNumber());
        ParkingSpot spot = spotManager.getSpotByNumber(vehicle.getVehicleNumber());
        spotManager.removeVehicle(spot, vehicle);
        System.out.println("Parking spot with id: "+spot.getSpotId()+" has been vacated.");
    }

    void calculateParkingCharge() {
        System.out.println("Processing your parking charge....");
        int duration = generatedTicket.getEntryTime();
        int amountToBePaid = pricingStrategy.calculateCost(vehicle, duration, DurationType.HOURLY);
        System.out.println("Amount to be paid: "+amountToBePaid);
        System.out.println("See you soon!");
    }
}
