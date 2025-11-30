package InventoryManagementSystem.Factory.ConcreteFactories;

import InventoryManagementSystem.Enums.ItemType;
import InventoryManagementSystem.Factory.Item;

public class BeverageItems extends Item {
    public BeverageItems(int id, String name, double price) {
        super(id, name, price, ItemType.BEVERAGE);
    }
}
