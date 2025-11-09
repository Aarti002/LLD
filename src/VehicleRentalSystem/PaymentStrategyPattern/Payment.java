package VehicleRentalSystem.PaymentStrategyPattern;

import VehicleRentalSystem.Enums.PaymentMode;

import java.util.Objects;

public class Payment {
    private PaymentMode mode;
    private int amount;

    Payment(PaymentMode mode, int amount) {
        this.mode = mode;
        this.amount = amount;
        Objects.requireNonNull(this.makePayment()).makePayment();
    }

    private PaymentStrategy makePayment() {
        switch (this.mode) {
            case CASH -> {
                return new Cash(this.amount);
            }
            case UPI -> {
                return new UPI(this.amount);
            }
            case CARD -> {
                return new Card(this.amount);
            }
            default -> {
                return null;
            }
        }
    }
}
