package VehicleRentalSystem.PaymentStrategyPattern;

import VehicleRentalSystem.Enums.PaymentMode;

public class Card implements PaymentStrategy {
    int amount;
    public Card(int amount) {
        this.amount = amount;
    }
    @Override
    public void makePayment() {
        System.out.println("Using "+ PaymentMode.CARD+" to pay "+this.amount);
    }
}
