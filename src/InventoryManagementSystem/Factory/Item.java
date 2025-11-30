package InventoryManagementSystem.Factory;

import InventoryManagementSystem.Enums.ItemType;
import InventoryManagementSystem.Enums.Status;

public class Item {
    private final int id;
    private final String name;
    private final double price;
    private final ItemType type;
    private Status status;

    protected Item(int id, String name, double price, ItemType type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ItemType getType() {
        return type;
    }

    public Status getStatus() {
        return status;
    }

    double getPrice() {
        return price;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
