package ParkingManagementSystem.ParkingSpot;

import ParkingManagementSystem.Eums.VehicleType;
import ParkingManagementSystem.VehicleFactory.Vehicle;

public abstract class ParkingSpot {
    private int spotId;
    private boolean isOccupied;
    private Vehicle vehicle;
    private VehicleType vehicleType;

    public ParkingSpot(int spotId, VehicleType vehicleType){
        this.spotId = spotId;
        this.isOccupied = false;
        this.vehicleType = vehicleType;
    }

    public abstract boolean canParkThisVehicle(Vehicle vehicle);

    public boolean isOccupied() {
        return this.isOccupied;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public int getSpotId() {
        return this.spotId;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public void parkVehicle(Vehicle vehicle) {
        if(isOccupied){
            throw new IllegalStateException("Space already Occupied!");
        }
        if(!canParkThisVehicle(vehicle)){
            throw new IllegalStateException("Vehicle of your type not allowed to be parked here.");
        }
        this.isOccupied = true;
        this.vehicle = vehicle;
    }

    public void vacateSpot() {
        if(!isOccupied){
            throw new IllegalStateException("Space already Vacant!");
        }
        this.isOccupied = false;
        this.vehicle = null;
    }
}
