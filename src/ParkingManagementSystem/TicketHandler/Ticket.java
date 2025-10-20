package ParkingManagementSystem.TicketHandler;

import ParkingManagementSystem.ParkingSpot.ParkingSpot;
import ParkingManagementSystem.VehicleFactory.Vehicle;

public class Ticket {
    private int entryTime;
    private Vehicle vehicle;
    private ParkingSpot occupiedSpot;

    public Ticket(int entryTime, Vehicle vehicle, ParkingSpot occupiedSpot) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.occupiedSpot = occupiedSpot;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public int getEntryTime() {
        return this.entryTime;
    }

    public ParkingSpot getOccupiedSpot() {
        return this.occupiedSpot;
    }
}
