package VendingMachine_StateDesignPattern.States.NextStates;

import VendingMachine_StateDesignPattern.Enums.Coins;
import VendingMachine_StateDesignPattern.States.MachineState;
import VendingMachine_StateDesignPattern.Utils.Item;
import VendingMachine_StateDesignPattern.VendingMachine.VendingMachine;

import java.util.List;

public class Dispensing implements MachineState {
    @Override
    public String getState() {
        return "DISPENSING";
    }

    @Override
    public boolean insertCoin(VendingMachine machine, Coins coins) {
        return false;
    }

    @Override
    public void returnExtraCoin(Item item, List<Coins> paidAmt) {
        System.out.println("You can't return extra coins at Dispensing state.");
    }

    @Override
    public Item dispenseItem(VendingMachine machine, Item item) {
        return null;
    }

    @Override
    public void returnExtraCoin(Item item, int paidAmt) {

    }

    @Override
    public void updateInventory(VendingMachine machine, Item item) {
        System.out.println("You can't Update inventory at Dispensing state.");
    }

    @Override
    public Item dispenseItem(VendingMachine machine, int itemCode) {
        System.out.println("Dispensing requested item.");
        Item item = machine.getItem(itemCode);
        machine.setCurrentState(new Idle());
        return item;
    }

    @Override
    public boolean cancelTnx(VendingMachine machine, Item item) {
        System.out.println("Processing refund request...");
        Coins coins = machine.getCoins(item);
        return machine.updateCoinsCollection(coins, true);
    }

    @Override
    public void pressItemCode(VendingMachine machine, int itemCode) {
        System.out.println("You can't Insert item code at Dispensing state.");
    }

    @Override
    public void selectItemButton(VendingMachine machine) {
        System.out.println("You can't press select item button at Dispensing state.");
    }

    @Override
    public boolean insertCoin(VendingMachine machine, List<Coins> coins) {
        System.out.println("You can't Insert Coins at Dispensing state.");
        return false;
    }

    @Override
    public void insertCoinButton(VendingMachine machine) {
        System.out.println("You can't press Insert Coin button at Dispensing state.");
    }
}
