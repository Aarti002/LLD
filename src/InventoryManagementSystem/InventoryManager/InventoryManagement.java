package InventoryManagementSystem.InventoryManager;

import InventoryManagementSystem.Utility.Warehouse;

import java.util.ArrayList;
import java.util.List;

public class InventoryManagement {
    List<Warehouse> warehouses;

    InventoryManagement() {
        this.warehouses = new ArrayList<>();
    }

    public void addWarehouse(Warehouse w) {
        warehouses.add(w);
    }

    public void getWarehouseReport(Warehouse w) {
        w.generateReport();
    }

}
