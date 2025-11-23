package VendingMachine_StateDesignPattern.VendingMachine;

import VendingMachine_StateDesignPattern.Enums.Coins;
import VendingMachine_StateDesignPattern.States.MachineState;
import VendingMachine_StateDesignPattern.States.NextStates.Idle;
import VendingMachine_StateDesignPattern.Utils.Item;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Item> currentItems;
    private List<Coins> currentCoins;
    private MachineState currentState;

    public VendingMachine() {
        this.currentState = new Idle();
        this.currentCoins = new ArrayList<>();
        this.currentItems = new ArrayList<>();
    }

    public MachineState getCurrentState() {
        return this.currentState;
    }

    public void setCurrentState(MachineState state) {
        currentState = state;
    }

    public List<Item> getCurrentItems() {
        return currentItems;
    }

    public Coins getCoins(Item item) {
        return item.getAmount();
    }

    public Item getItem(int itemCode) {
        for(Item i:currentItems) {
            if(i.getItemCode() == itemCode)
                return i;
        }
        return null;
    }

    public void updateInventory(Item item, boolean toBeRemoved) {
        if(toBeRemoved) {
            currentItems.remove(item);
        } else {
            currentItems.add(item);
        }
    }

    public boolean updateCoinsCollection(Coins coins, boolean toBeRemoved) {
        if(toBeRemoved) {
            return currentCoins.remove(coins);
        } else {
            return currentCoins.add(coins);
        }
    }

    public void displayInventory() {
        for(Item i:currentItems) {
            System.out.println(i.getItemCode()+"-"+i.getName()+": "+i.getAmount());
        }
    }

}
