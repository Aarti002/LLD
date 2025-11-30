package InventoryManagementSystem.Utility;

import InventoryManagementSystem.Enums.Status;
import InventoryManagementSystem.Factory.Item;
import InventoryManagementSystem.Observers.QualityControlNotifier;
import InventoryManagementSystem.Observers.WarehouseAuditNotifier;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private final String name;
    private final Location location;
    List<Item> items;
    WarehouseAuditNotifier notifier;
    QualityControlNotifier qualityNotifier;

    public Warehouse(String name, Location loc) {
        this.name = name;
        this.location = loc;
        this.items = new ArrayList<>();
        this.notifier = new WarehouseAuditNotifier();
        this.qualityNotifier = new QualityControlNotifier();
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public void addItem(Item newItem) {
        notifier.sendNotificationOnItem(this, newItem);
        this.items.add(newItem);
    }

    public boolean removeItem(Item item){
        if(this.items.isEmpty()) {
            System.out.println("Looks like warehouse does not have this item!");
            return false;
        }
        if(items.contains(item)) {
            items.remove(item);
            notifier.sendNotificationOnItem(this, item);
            if(items.isEmpty()) {
                notifier.sendNotificationForRefilling(this, item.getType(), 1);
            }
            return true;
        }
        return false;
    }

    public boolean updateItemStatus(Item item, Status status) {
        if(this.items.isEmpty()) {
            System.out.println("Looks like warehouse does not have this item!");
            return false;
        }
        if(items.contains(item)) {
            int x = items.indexOf(item);
            Item tempItem = items.get(x);
            tempItem.setStatus(status);
            System.out.println("Item status updated to: "+tempItem.getStatus());

            if(tempItem.getStatus() == Status.DAMAGED || tempItem.getStatus() == Status.EXPIRED) {
                qualityNotifier.sendNotificationForDamagedOrExpiredItem(tempItem);
            }

            return true;
        }
        return false;
    }

    public List<Item> getItems() {
        return items;
    }

    public void generateReport() {
        System.out.println("Warehouse Current Report:");
        System.out.println("At: "+getLocation().getPinCode());
        System.out.println("Name: "+getName());
        System.out.println("Items Quantity: "+items.size());
    }
}
