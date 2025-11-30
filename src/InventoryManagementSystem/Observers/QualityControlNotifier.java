package InventoryManagementSystem.Observers;

import InventoryManagementSystem.Factory.Item;

public class QualityControlNotifier {
    public void sendNotificationForDamagedOrExpiredItem(Item item) {
        System.out.println("!!!!!!!!!!Quality Check Failure!!!!!!!!!!");
        System.out.println("Item Id: "+item.getId());
        System.out.println("Item Type: "+item.getType());
        System.out.println("Item Name: "+item.getName());
        System.out.println("Item Status: "+item.getStatus());
    }
}
