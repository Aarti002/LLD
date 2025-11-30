package InventoryManagementSystem.Observers;

import InventoryManagementSystem.Enums.ItemType;
import InventoryManagementSystem.Factory.Item;
import InventoryManagementSystem.Utility.Warehouse;

public class WarehouseAuditNotifier {
    public void sendNotificationForRefilling(Warehouse warehouse, ItemType type, int quantity) {
        System.out.println("Gentle Reminder for refilling of items!");
        System.out.println("Request coming from warehouse at: "+warehouse.getLocation().getPinCode());
        System.out.println("Item Type: "+type);
        System.out.println("Item Quantity: "+quantity);
    }

    public void sendNotificationOnItem(Warehouse warehouse, Item item) {
        System.out.println("--------------Item Update Starts--------------");
        System.out.println("Warehouse at: "+warehouse.getLocation().getPinCode());
        System.out.println("Item Type: "+item.getType());
        System.out.println("Item Name: "+item.getName());
        System.out.println("Item quantity: "+warehouse.getItems().size());
        System.out.println("--------------Item Update Ends--------------");
    }
}
