package VehicleRentalSystem;

import VehicleRentalSystem.Core.Location;
import VehicleRentalSystem.Core.Reservation;
import VehicleRentalSystem.Core.Store;
import VehicleRentalSystem.Core.User;
import VehicleRentalSystem.Enums.PaymentMode;
import VehicleRentalSystem.Enums.ReservationStatus;
import VehicleRentalSystem.Enums.VehicleStatus;
import VehicleRentalSystem.Enums.VehicleType;
import VehicleRentalSystem.VehicleFactoryPattern.NewVehicle;
import VehicleRentalSystem.VehicleFactoryPattern.VehicleFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VehicleRentalController {
    public static void main(String[] args) {
        Location location = new Location("Bangalore", "560103");
        Store bangaloreStore = new Store("Zoom Car", location);

        User user_1 = new User(101, "Ashwin");
        User user_2 = new User(102, "Aarti");

        VehicleFactory vehicleFactory = new VehicleFactory();
        NewVehicle car_1 = vehicleFactory.createVehicle(VehicleType.CAR);
//        NewVehicle car_2 = vehicleFactory.createVehicle(VehicleType.CAR);
        car_1.setVehicleStatus(VehicleStatus.AVAILABLE);
        car_1.setVehicleNum("123-567");
//        car_2.setVehicleStatus(VehicleStatus.AVAILABLE);
//        car_2.setVehicleNum("121-565");

        NewVehicle bike_1 = vehicleFactory.createVehicle(VehicleType.BIKE);
        NewVehicle bike_2 = vehicleFactory.createVehicle(VehicleType.BIKE);
        bike_1.setVehicleStatus(VehicleStatus.AVAILABLE);
        bike_1.setVehicleNum("11-22-33");
        bike_2.setVehicleStatus(VehicleStatus.AVAILABLE);
        bike_2.setVehicleNum("44-55-77");

        NewVehicle scooty_1 = vehicleFactory.createVehicle(VehicleType.SCOOTY);
        scooty_1.setVehicleStatus(VehicleStatus.AVAILABLE);
        scooty_1.setVehicleNum("12-34-56");

        bangaloreStore.addUserDetail(user_1);
        bangaloreStore.addUserDetail(user_2);

        bangaloreStore.addVehicleDetail(car_1);
//        bangaloreStore.addVehicleDetail(car_2);
        bangaloreStore.addVehicleDetail(bike_1);
        bangaloreStore.addVehicleDetail(bike_2);
        bangaloreStore.addVehicleDetail(scooty_1);

        bangaloreStore.showAllCars();
        bangaloreStore.showAllBikes();
        bangaloreStore.showAllScooties();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("\n---------------CUSTOMER-1: BOOKING IN PROGRESS--------------\n");
        String startDate = "01-01-2025 10:30:00";
        LocalDateTime parsedStartDateTime = LocalDateTime.parse(startDate, formatter);
        String endDate = "05-01-2025 10:30:00";
        LocalDateTime parsedEndDateTime = LocalDateTime.parse(endDate, formatter);

        String pickUp = "Ballendur";
        String drop = "Coorg";
        boolean isBookingSuccessful1 = bangaloreStore.makeCarReservation(user_1, parsedStartDateTime, parsedEndDateTime, pickUp, drop);

        if(isBookingSuccessful1) {
            System.out.println("Your booking was successful, you will get your booked vehicle at given pick-up!");
        } else {
            System.out.println("Oh no, something went wrong!");
        }

        System.out.println("\n---------------CUSTOMER-2: BOOKING IN PROGRESS--------------\n");
        String startDate1 = "06-01-2025 10:30:00";
        LocalDateTime parsedStartDateTime1 = LocalDateTime.parse(startDate1, formatter);
        String endDate1 = "10-01-2025 10:30:00";
        LocalDateTime parsedEndDateTime1 = LocalDateTime.parse(endDate1, formatter);

        String pickUp1 = "Green Glen";
        String drop1 = "Ooty";
        boolean isBookingSuccessful2 = bangaloreStore.makeCarReservation(user_2, parsedStartDateTime1, parsedEndDateTime1, pickUp1, drop1);

        if(isBookingSuccessful2) {
            System.out.println("\nYour booking was successful, you will get your booked vehicle at given pick-up!");
        } else {
            System.out.println("\nOh no, something went wrong!");
        }

        System.out.println("\n---------------CUSTOMER-1: BOOKING COMPLETE--------------\n");
        Reservation reservation = bangaloreStore.getUserReservations(user_1).get(0);
        reservation.generateBillAndMakePayment(true, 1);  //damage: true, delay: 1 h
        bangaloreStore.updateReservationStatus(reservation.getVehicle(), VehicleStatus.AVAILABLE, reservation, ReservationStatus.COMPLETED);
        reservation.makePayment(PaymentMode.CARD);

        System.out.println("\n---------------CUSTOMER-2: BOOKING RETRY--------------\n");
        boolean isBookingSuccessful3 = bangaloreStore.makeCarReservation(user_2, parsedStartDateTime1, parsedEndDateTime1, pickUp1, drop1);

        if(isBookingSuccessful3) {
            System.out.println("\nYour booking was successful, you will get your booked vehicle at given pick-up!");
        } else {
            System.out.println("\nOh no, something went wrong!");
        }

        System.out.println("\n---------------CUSTOMER-2: BOOKING COMPLETE--------------\n");
        Reservation reservation1 = bangaloreStore.getUserReservations(user_2).get(0);
        reservation1.generateBillAndMakePayment(false, 0);
        bangaloreStore.updateReservationStatus(reservation1.getVehicle(), VehicleStatus.AVAILABLE, reservation1, ReservationStatus.COMPLETED);
        reservation1.makePayment(PaymentMode.UPI);

        System.out.println("\n---------------CUSTOMER-1: BOOKING BIKE IN PROGRESS--------------\n");
        boolean isBookingSuccessful4 = bangaloreStore.makeBikeReservation(user_1, parsedStartDateTime, parsedEndDateTime, pickUp, drop);

        if(isBookingSuccessful4) {
            System.out.println("\nYour booking was successful, you will get your booked vehicle at given pick-up!");
        } else {
            System.out.println("\nOh no, something went wrong!");
        }

        Reservation reservation2 = bangaloreStore.getUserReservations(user_1).get(0);

        System.out.println("\n---------------CUSTOMER-2: BOOKING SCOOTY IN PROGRESS--------------\n");
        boolean isBookingSuccessful5 = bangaloreStore.makeScootyReservation(user_2, parsedStartDateTime1, parsedEndDateTime1, pickUp1, drop1);

        if(isBookingSuccessful5) {
            System.out.println("\nYour booking was successful, you will get your booked vehicle at given pick-up!");
        } else {
            System.out.println("\nOh no, something went wrong!");
        }

        System.out.println("\n---------------CUSTOMER-2: BOOKING SCOOTY COMPLETE--------------\n");
        Reservation reservation3 = bangaloreStore.getUserReservations(user_2).get(0);
        reservation3.generateBillAndMakePayment(true, 3);
        bangaloreStore.updateReservationStatus(reservation3.getVehicle(), VehicleStatus.AVAILABLE, reservation3, ReservationStatus.COMPLETED);
        reservation3.makePayment(PaymentMode.CASH);

    }
}
