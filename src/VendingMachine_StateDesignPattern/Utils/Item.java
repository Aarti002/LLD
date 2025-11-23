package VendingMachine_StateDesignPattern.Utils;

import VendingMachine_StateDesignPattern.Enums.Coins;

public class Item {
    private String name;
    private Coins amount;
    private int itemCode;

    public Item(String name, int itemCode, Coins amt) {
        this.name = name;
        this.itemCode = itemCode;
        this.amount = amt;
    }

    public String getName() {
        return this.name;
    }

    public Coins getAmount() {
        return this.amount;
    }

    public int getItemCode() {
        return this.itemCode;
    }

}
