package VendingMachine_StateDesignPattern.States.NextStates;

import VendingMachine_StateDesignPattern.Enums.Coins;
import VendingMachine_StateDesignPattern.States.MachineState;
import VendingMachine_StateDesignPattern.Utils.Item;
import VendingMachine_StateDesignPattern.VendingMachine.VendingMachine;

import java.util.List;

public class Idle implements MachineState {

    @Override
    public String getState() {
        return "IDLE";
    }

    @Override
    public boolean insertCoin(VendingMachine machine, Coins coin) {
        System.out.println("You can't insert coin at Idle state.");
        return false;
    }

    @Override
    public void insertCoinButton(VendingMachine machine) {
        machine.setCurrentState(new HasCoins());
    }

    @Override
    public boolean insertCoin(VendingMachine machine, List<Coins> coins) {
        System.out.println("You can't insert coin at Idle state.");
        return false;
    }

    @Override
    public void selectItemButton(VendingMachine machine) {
        System.out.println("You can't select item at Idle state.");
    }

    @Override
    public void pressItemCode(VendingMachine machine, int itemCode) {
        System.out.println("You can't get item at Idle state.");
    }

    @Override
    public Item dispenseItem(VendingMachine machine, int itemCode) {
        System.out.println("You can't dispense item at Idle state.");
        return null;
    }

    @Override
    public boolean cancelTnx(VendingMachine machine, Item item) {
        System.out.println("You can't get coins back at Idle state.");
        return false;
    }

    @Override
    public void returnExtraCoin(Item item, List<Coins> paidAmt) {
        System.out.println("You can't get extra coins at Idle state.");
    }

    @Override
    public Item dispenseItem(VendingMachine machine, Item item) {
        System.out.println("You can't dispense item at Idle state.");
        return null;
    }

    @Override
    public void returnExtraCoin(Item item, int paidAmt) {
        System.out.println("You can't get extra coins at Idle state.");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item) {
        System.out.println("Inventory cannot be updated at Idle state.");
    }
}
