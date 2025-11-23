package VendingMachine_StateDesignPattern.Utils;

import java.util.List;

public class Inventory {
    private List<Item> currentItems;

    Inventory(List<Item> items) {
        this.currentItems = items;
    }

    public List<Item> getCurrentItems() {
        return currentItems;
    }

    public Item getItemDetails(int code) {
        for(Item itm:currentItems) {
            if(itm.getItemCode() == code){
                return itm;
            }
        }
        return null;
    }

    public void addItem(Item item) {
        currentItems.add(item);
    }

    public boolean isPresent(Item item) {
        for(Item itm:currentItems) {
            if(itm == item){
                return true;
            }
        }
        return false;
    }

    public boolean removeItem(int itemCode) {
        for(Item itm:currentItems) {
            if(itm.getItemCode() == itemCode){
                currentItems.remove(itm);
                return true;
            }
        }
        return false;
    }
}
