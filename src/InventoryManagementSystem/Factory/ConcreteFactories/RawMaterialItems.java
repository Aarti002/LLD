package InventoryManagementSystem.Factory.ConcreteFactories;

import InventoryManagementSystem.Enums.ItemType;
import InventoryManagementSystem.Factory.Item;

public class RawMaterialItems extends Item {
    public RawMaterialItems(int id, String name, double price) {
        super(id, name, price, ItemType.RAW_MATERIAL);
    }
}
