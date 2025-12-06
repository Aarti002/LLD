package ATMManagementSystem.Core;

import java.util.Date;

public class Card {
    private String holderName;
    private static final int pin = 5748;
    private static final int cvv = 323;
    private static final String expiryDate = "2026/12/30";

    public Card(String name) {
        this.holderName = name;
    }

    private int getPin() {
        return pin;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public int getCVV() {
        return cvv;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public boolean validatePin(int pin) {
        return pin == getPin();
    }
}
