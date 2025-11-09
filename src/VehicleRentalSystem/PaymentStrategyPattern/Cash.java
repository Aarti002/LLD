package VehicleRentalSystem.PaymentStrategyPattern;

import VehicleRentalSystem.Enums.PaymentMode;

public class Cash implements PaymentStrategy {
    int amount;
    public Cash(int amount) {
        this.amount = amount;
    }

    @Override
    public void makePayment() {
        System.out.println("Using "+ PaymentMode.CASH+" to pay "+this.amount);
    }
}
