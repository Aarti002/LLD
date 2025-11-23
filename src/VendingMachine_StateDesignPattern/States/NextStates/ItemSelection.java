package VendingMachine_StateDesignPattern.States.NextStates;

import VendingMachine_StateDesignPattern.Enums.Coins;
import VendingMachine_StateDesignPattern.States.MachineState;
import VendingMachine_StateDesignPattern.Utils.Item;
import VendingMachine_StateDesignPattern.VendingMachine.VendingMachine;

import java.util.List;

public class ItemSelection implements MachineState {
    @Override
    public String getState() {
        return "ITEM_SELECTION";
    }

    @Override
    public boolean insertCoin(VendingMachine machine, Coins coins) {
        return false;
    }

    @Override
    public void returnExtraCoin(Item item, int paidAmt) {
        int extra = paidAmt - item.getAmount().value;
        System.out.println("Returning extra coins: "+ extra);
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item) {
        System.out.println("You can't update inventory at Item Selection state.");
    }

    @Override
    public Item dispenseItem(VendingMachine machine, Item item) {
        System.out.println("You can't dispense item at Item Selection state.");
        return null;
    }

    @Override
    public boolean cancelTnx(VendingMachine machine, Item item) {
        System.out.println("Processing refund request...");
        Coins coins = machine.getCoins(item);
        return machine.updateCoinsCollection(coins, true);
    }

    @Override
    public void returnExtraCoin(Item item, List<Coins> paidAmt) {

    }

    @Override
    public void pressItemCode(VendingMachine machine, int itemCode) {
        Item item = machine.getItem(itemCode);
        if(item != null) {
            machine.setCurrentState(new Dispensing());
            machine.updateInventory(item, true);
        } else {
            System.out.println("Oops... no such item.");
        }
    }

    @Override
    public Item dispenseItem(VendingMachine machine, int itemCode) {
        return null;
    }

    @Override
    public void selectItemButton(VendingMachine machine) {
        return ;
    }

    @Override
    public boolean insertCoin(VendingMachine machine, List<Coins> coins) {
        System.out.println("You can't Insert coin at Item Selection state.");
        return false;
    }

    @Override
    public void insertCoinButton(VendingMachine machine) {
        System.out.println("You can't press Insert Coin button at Item Selection state.");
    }
}
