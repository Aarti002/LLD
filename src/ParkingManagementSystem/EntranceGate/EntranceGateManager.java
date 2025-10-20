package ParkingManagementSystem.EntranceGate;

import ParkingManagementSystem.ParkingSpot.ParkingSpot;
import ParkingManagementSystem.ParkingSpotManager.ParkingSpotManager;
import ParkingManagementSystem.TicketHandler.Ticket;
import ParkingManagementSystem.VehicleFactory.Vehicle;

public class EntranceGateManager {
    Vehicle vehicle;
    ParkingSpotManager spotManager;
    Ticket generateTicket;
    ParkingSpot spot;

    public EntranceGateManager(Vehicle vehicle, ParkingSpotManager mng) {
        this.spotManager = mng;
        this.vehicle = vehicle;
        this.spot = findParkingSpot();
        this.generateTicket = generateTicket();
    }

    public ParkingSpot findParkingSpot() {
        System.out.println("Looking for parking space for your: "+this.vehicle.getVehicleType());

        ParkingSpot spot = spotManager.findAvailableSpot(this.vehicle.getVehicleType());
        if(spot!=null){
            System.out.println("Go ahead there is a spot available for you.");
            return spotManager.parkVehicle(this.vehicle);
        }
        System.out.println("Looks like parking lot is all occupied.");
        return null;
    }

    public Ticket generateTicket() {
        System.out.println("Generating ticket for your: "+this.vehicle.getVehicleType() + " with vehicle number: "+this.vehicle.getVehicleNumber());
        generateTicket = new Ticket(10, this.vehicle, this.spot);
        System.out.println("Ticket generated successfully for Spot: "+this.generateTicket.getOccupiedSpot());
        return generateTicket;
    }
}
