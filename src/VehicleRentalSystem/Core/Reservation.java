package VehicleRentalSystem.Core;

import VehicleRentalSystem.Enums.PaymentMode;
import VehicleRentalSystem.Enums.ReservationStatus;
import VehicleRentalSystem.PaymentStrategyPattern.Bill;
import VehicleRentalSystem.VehicleFactoryPattern.NewVehicle;

import java.time.LocalDateTime;

public class Reservation {
    private final User user;
    private final NewVehicle vehicle;
    private final LocalDateTime startDateTime;
    private final LocalDateTime endDateTime;
    private final String pickUp;
    private final String drop;
    private ReservationStatus status;
    private Bill bill;

    Reservation(User user, NewVehicle vehicle, LocalDateTime start, LocalDateTime end, String pickUp, String drop) {
        this.user = user;
        this.vehicle = vehicle;
        this.startDateTime = start;
        this.endDateTime = end;
        this.pickUp = pickUp;
        this.drop = drop;
        this.status = ReservationStatus.SCHEDULED;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public void generateBillAndMakePayment(boolean damage, int delay) {
        this.bill = new Bill(vehicle, user, startDateTime, endDateTime, damage, delay);
    }

    public int makePayment(PaymentMode mode) {
        return this.bill.makePayment(mode);
    }

    public User getUser() {
        return user;
    }

    public NewVehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public String getPickUp() {
        return pickUp;
    }

    public String getDrop() {
        return drop;
    }

    public ReservationStatus getStatus() {
        return status;
    }
}
