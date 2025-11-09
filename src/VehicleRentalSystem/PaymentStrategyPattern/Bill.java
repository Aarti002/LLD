package VehicleRentalSystem.PaymentStrategyPattern;

import VehicleRentalSystem.Core.User;
import VehicleRentalSystem.Enums.PaymentMode;
import VehicleRentalSystem.VehicleFactoryPattern.NewVehicle;

import java.time.LocalDateTime;

public class Bill {
    private User user;
    private NewVehicle vehicle;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int amount;
    private Payment payment;
    private boolean isDamaged;
    private int isDelayed;

    public Bill(NewVehicle vehicle, User user, LocalDateTime start, LocalDateTime end, boolean damage, int delay) {
        this.vehicle = vehicle;
        this.user = user;
        this.startDate = start;
        this.endDate = end;
        this.isDamaged = damage;
        this.isDelayed = delay;
        this.amount = 0;
        this.printBill();
    }

    private void printBill() {
        System.out.println("Hey "+user.getUserName()+", ");
        System.out.println("Thanks for choosing us, below is the details of your reservation: ");
        System.out.println("Start Date and time: "+this.startDate);
        System.out.println("Start End and time: "+this.endDate);
        System.out.println("Any Damage: "+this.isDamaged);
        System.out.println("Any Delay: "+this.isDelayed);
    }

    public int makePayment(PaymentMode mode) {
        amount = vehicle.getCharge();
        if(isDamaged) {
            amount+= vehicle.getDamageCharge();
        }
        amount+=isDelayed*50;
        this.payment = new Payment(mode, amount);
        System.out.println("Payment successfully made, thanks!");
        return amount;
    }
}
