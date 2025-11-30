package InventoryManagementSystem.Factory.ConcreteFactories;

import InventoryManagementSystem.Enums.ItemType;
import InventoryManagementSystem.Factory.Item;

public class NonPermishableItems extends Item {
    public NonPermishableItems(int id, String name, double price) {
        super(id, name, price, ItemType.NON_PERISHABLE_GOODS);
    }
}