package InventoryManagementSystem.Factory.ConcreteFactories;

import InventoryManagementSystem.Enums.ItemType;
import InventoryManagementSystem.Factory.Item;

public class PerishableItems extends Item {
    public PerishableItems(int id, String name, double price) {
        super(id, name, price, ItemType.PERISHABLE_GOODS);
    }
}
