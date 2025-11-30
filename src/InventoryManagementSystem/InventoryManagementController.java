package InventoryManagementSystem;

import InventoryManagementSystem.Enums.ItemType;
import InventoryManagementSystem.Enums.Status;
import InventoryManagementSystem.Factory.Item;
import InventoryManagementSystem.Factory.ItemFactory;
import InventoryManagementSystem.Utility.Location;
import InventoryManagementSystem.Utility.Warehouse;

import java.util.List;

public class InventoryManagementController {
    public static void main(String[] args) {
        ItemFactory itemFactory = new ItemFactory();
        Item mazza = itemFactory.createItem(001, "Mazza", 25.00, ItemType.BEVERAGE);
        Item rice = itemFactory.createItem(002, "Perry's Rice", 125.70, ItemType.RAW_MATERIAL);
        Item cheese = itemFactory.createItem(003, "Amul Cheese", 75.55, ItemType.PERISHABLE_GOODS);
        Item coffee = itemFactory.createItem(004, "Nescafe Dark Coffee", 100.50, ItemType.NON_PERISHABLE_GOODS);

        Location pune = new Location("Pune", "802133");
        Warehouse puneWarehouse = new Warehouse("Misal-Paw Inventory Store", pune);
        puneWarehouse.addItem(mazza);
        puneWarehouse.addItem(rice);
        puneWarehouse.addItem(cheese);
        puneWarehouse.addItem(coffee);

        puneWarehouse.generateReport();

        List<Item> items = puneWarehouse.getItems();
        puneWarehouse.updateItemStatus(items.get(0), Status.EXPIRED);


    }
}
