package VehicleRentalSystem.Core;

import VehicleRentalSystem.Enums.VehicleStatus;
import VehicleRentalSystem.Enums.VehicleType;
import VehicleRentalSystem.VehicleFactoryPattern.NewVehicle;

import java.util.List;

public class VehicleInventoryManagement {
    List<NewVehicle> vehicleList;

    VehicleInventoryManagement(List<NewVehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void addVehicle(NewVehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public boolean removeVehicle(NewVehicle vehicle) {
        if(vehicle.getStatus() == VehicleStatus.NOT_AVAILABLE) {
            System.out.println(vehicle.getVehicleNum() + " is being used by someone. Can't be removed from Inventory.");
            return false;
        } else {
            for(NewVehicle item:vehicleList) {
                if(item.getVehicleNum() == vehicle.getVehicleNum()) {
                    vehicleList.remove(item);
                    System.out.println(vehicle.getVehicleNum() + " has been removed from Inventory.");
                    return true;
                }
            }
        }
        System.out.println(vehicle.getVehicleNum() + " is not present. Can't be removed from Inventory.");
        return false;
    }

    public boolean checkCarAvailability() {
        for(NewVehicle item:vehicleList) {
            if(item.getType() == VehicleType.CAR && item.getStatus() == VehicleStatus.AVAILABLE) {
                System.out.println(item.getType() + " with vehicle number " + item.getVehicleNum() + " is available to be booked!");
                return true;
            }
        }
        System.out.println("Looks like no "+VehicleType.CAR+" is available to be booked, sorry.");
        return false;
    }

    public NewVehicle getAvailableCar() {
        for(NewVehicle item:vehicleList) {
            if(item.getType() == VehicleType.CAR && item.getStatus() == VehicleStatus.AVAILABLE) {
                System.out.println(item.getType() + " with vehicle number " + item.getVehicleNum() + " is ready to be booked!");
                return item;
            }
        }
        return null;
    }

    public boolean checkBikeAvailability() {
        for(NewVehicle item:vehicleList) {
            if(item.getType() == VehicleType.BIKE && item.getStatus() == VehicleStatus.AVAILABLE) {
                System.out.println(item.getType() + " with vehicle number " + item.getVehicleNum() + " is available to be booked!");
                return true;
            }
        }
        System.out.println("Looks like no "+VehicleType.BIKE+" is available to be booked, sorry.");
        return false;
    }

    public NewVehicle getAvailableBike() {
        for(NewVehicle item:vehicleList) {
            if(item.getType() == VehicleType.BIKE && item.getStatus() == VehicleStatus.AVAILABLE) {
                System.out.println(item.getType() + " with vehicle number " + item.getVehicleNum() + " is ready to be booked!");
                return item;
            }
        }
        return null;
    }

    public boolean checkScootyAvailability() {
        for(NewVehicle item:vehicleList) {
            if(item.getType() == VehicleType.SCOOTY && item.getStatus() == VehicleStatus.AVAILABLE) {
                System.out.println(item.getType() + " with vehicle number " + item.getVehicleNum() + " is available to be booked!");
                return true;
            }
        }
        System.out.println("Looks like no "+VehicleType.SCOOTY+" is available to be booked, sorry.");
        return false;
    }

    public NewVehicle getAvailableScooty() {
        for(NewVehicle item:vehicleList) {
            if(item.getType() == VehicleType.SCOOTY && item.getStatus() == VehicleStatus.AVAILABLE) {
                System.out.println(item.getType() + " with vehicle number " + item.getVehicleNum() + " is ready to be booked!");
                return item;
            }
        }
        return null;
    }

    public boolean updateVehicleStatus(NewVehicle vehicle, VehicleStatus status) {
        for(NewVehicle item:vehicleList) {
            if(item.getVehicleNum() == vehicle.getVehicleNum()) {
                item.setVehicleStatus(status);
                System.out.println(item.getType() + " with vehicle number " + item.getVehicleNum() + " status has been updated now it's "+item.getStatus());
                return true;
            }
        }
        System.out.println("Looks like no such "+vehicle.getType()+" present in the inventory.");
        return false;
    }
}
