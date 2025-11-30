package InventoryManagementSystem.Factory;

import InventoryManagementSystem.Enums.ItemType;
import InventoryManagementSystem.Factory.ConcreteFactories.BeverageItems;
import InventoryManagementSystem.Factory.ConcreteFactories.NonPermishableItems;
import InventoryManagementSystem.Factory.ConcreteFactories.PerishableItems;
import InventoryManagementSystem.Factory.ConcreteFactories.RawMaterialItems;

public class ItemFactory {
    public Item createItem(int id, String name, double price, ItemType type) {
        switch (type) {
            case BEVERAGE:
                return new BeverageItems(id, name, price);
            case PERISHABLE_GOODS:
                return new PerishableItems(id, name, price);
            case NON_PERISHABLE_GOODS:
                return new NonPermishableItems(id, name, price);
            case RAW_MATERIAL:
                return new RawMaterialItems(id, name, price);
        }
        return null;
    }
}
