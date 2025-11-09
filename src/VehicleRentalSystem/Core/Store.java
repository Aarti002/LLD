package VehicleRentalSystem.Core;

import VehicleRentalSystem.Enums.ReservationStatus;
import VehicleRentalSystem.Enums.VehicleStatus;
import VehicleRentalSystem.Enums.VehicleType;
import VehicleRentalSystem.VehicleFactoryPattern.NewVehicle;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Store {
    String storeName;
    Location location;
    List<NewVehicle> vehicleList;
    List<User> userList;
    List<Reservation> reservations;
    VehicleInventoryManagement vehInvMng;

    public Store(String name, Location loc) {
        this.storeName = name;
        this.location = loc;
        this.vehicleList = new ArrayList<>();
        this.userList = new ArrayList<>();
        this.reservations = new ArrayList<>();
        this.vehInvMng = new VehicleInventoryManagement(this.vehicleList);
    }

    public void addUserDetail(User user) {
        userList.add(user);
    }

    public void addVehicleDetail(NewVehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public boolean isCarAvailable() {
        return vehInvMng.checkCarAvailability();
    }

    public void showAllCars() {
        System.out.println("Below are the options available in "+VehicleType.CAR+": ");
        for(NewVehicle veh:vehicleList) {
            if(veh.getType() == VehicleType.CAR) {
                System.out.println(veh.getVehicleNum());
            }
        }
    }

    public void showAllBikes() {
        System.out.println("\nBelow are the options available in "+VehicleType.BIKE+": ");
        for(NewVehicle veh:vehicleList) {
            if(veh.getType() == VehicleType.BIKE) {
                System.out.println(veh.getVehicleNum());
            }
        }
    }

    public void showAllScooties() {
        System.out.println("\nBelow are the options available in "+VehicleType.SCOOTY+": ");
        for(NewVehicle veh:vehicleList) {
            if(veh.getType() == VehicleType.SCOOTY) {
                System.out.println(veh.getVehicleNum());
            }
        }
    }

    public List<Reservation> getUserReservations(User user) {
        List<Reservation> allRes = new ArrayList<>();
        for(Reservation res: reservations) {
            if(res.getUser() == user && res.getStatus() == ReservationStatus.SCHEDULED) {
                System.out.println(res.getUser().getUserName()+" has rented "+res.getVehicle().getType());
                allRes.add(res);
            }
        }
        return  allRes;
    }

    public void updateReservationStatus(NewVehicle vehicle, VehicleStatus vehStatus, Reservation res, ReservationStatus resStatus) {
        vehInvMng.updateVehicleStatus(vehicle, vehStatus);
        res.setStatus(resStatus);
    }

    public boolean makeCarReservation(User user, LocalDateTime startDate, LocalDateTime endDate, String pickUp, String drop) {
        if(isCarAvailable()) {
            NewVehicle vehicle = vehInvMng.getAvailableCar();
            Reservation newReservation = new Reservation(user, vehicle, startDate, endDate, pickUp, drop);
            userList.add(user);
            reservations.add(newReservation);
            vehInvMng.updateVehicleStatus(vehicle, VehicleStatus.NOT_AVAILABLE);
            return true;
        }
        return false;
    }

    public boolean isBikeAvailable() {
        return vehInvMng.checkBikeAvailability();
    }

    public boolean makeBikeReservation(User user, LocalDateTime startDate, LocalDateTime endDate, String pickUp, String drop) {
        if(isBikeAvailable()) {
            NewVehicle vehicle = vehInvMng.getAvailableBike();
            Reservation newReservation = new Reservation(user, vehicle, startDate, endDate, pickUp, drop);
            userList.add(user);
            reservations.add(newReservation);
            vehInvMng.updateVehicleStatus(vehicle, VehicleStatus.NOT_AVAILABLE);
            return true;
        }
        return false;
    }

    public boolean isScootyAvailable() {
       return vehInvMng.checkScootyAvailability();
    }

    public boolean makeScootyReservation(User user, LocalDateTime startDate, LocalDateTime endDate, String pickUp, String drop) {
        if(isScootyAvailable()) {
            NewVehicle vehicle = vehInvMng.getAvailableScooty();
            Reservation newReservation = new Reservation(user, vehicle, startDate, endDate, pickUp, drop);
            userList.add(user);
            vehInvMng.updateVehicleStatus(vehicle, VehicleStatus.NOT_AVAILABLE);
            reservations.add(newReservation);
            return true;
        }
        return false;
    }
}
