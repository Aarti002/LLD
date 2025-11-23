package VendingMachine_StateDesignPattern.Enums;

public enum Coins {
    ONE_RUPEE(1),
    TWO_RUPEES(2),
    FIVE_RUPEES(5),
    TEN_RUPEES(10);
    // Value of the coin in Indian rupees
    public final int value;

    // Constructor to initialize the coin's value
    Coins(int value) {
        this.value = value;
    }
}