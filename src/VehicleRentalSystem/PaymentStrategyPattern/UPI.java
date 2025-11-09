package VehicleRentalSystem.PaymentStrategyPattern;

import VehicleRentalSystem.Enums.PaymentMode;

public class UPI implements PaymentStrategy {
    int amount;
    public UPI(int amount) {
        this.amount = amount;
    }

    @Override
    public void makePayment() {
        System.out.println("Using "+ PaymentMode.UPI+" to pay "+this.amount);
    }
}
