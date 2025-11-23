package VendingMachine_StateDesignPattern.States.NextStates;

import VendingMachine_StateDesignPattern.Enums.Coins;
import VendingMachine_StateDesignPattern.States.MachineState;
import VendingMachine_StateDesignPattern.Utils.Item;
import VendingMachine_StateDesignPattern.VendingMachine.VendingMachine;

import java.util.List;

public class HasCoins implements MachineState {

    @Override
    public String getState() {
        return "HAS_COINS";
    }

    @Override
    public boolean insertCoin(VendingMachine machine, Coins coin) {
        System.out.println("Coins Inserted!");
        return machine.updateCoinsCollection(coin, false);
    }

    @Override
    public boolean insertCoin(VendingMachine machine, List<Coins> coins) {
        for (Coins coin : coins) {
            machine.updateCoinsCollection(coin, false);
        }
        return true;
    }

    @Override
    public void insertCoinButton(VendingMachine machine) {
        System.out.println("Already in coin insertion mode.");
    }

    @Override
    public void selectItemButton(VendingMachine machine) {
        machine.setCurrentState(new ItemSelection());
    }

    @Override
    public void pressItemCode(VendingMachine machine, int itemCode) {
        System.out.println("Please press Select Item button first.");
    }

    @Override
    public boolean cancelTnx(VendingMachine machine, Item item) {
        System.out.println("Processing refund request...");
        Coins coins = machine.getCoins(item);
        return machine.updateCoinsCollection(coins, true);
    }

    @Override
    public void returnExtraCoin(Item item, int paidAmt) {
        System.out.println("Extra coin handling happens after item dispense.");
    }

    @Override
    public void returnExtraCoin(Item item, List<Coins> paidAmt) {
        System.out.println("Extra coin handling happens after item dispense.");
    }

    @Override
    public Item dispenseItem(VendingMachine machine, Item item) {
        System.out.println("You can't dispense item at HasCoins state.");
        return null;
    }

    @Override
    public Item dispenseItem(VendingMachine machine, int itemCode) {
        System.out.println("You can't dispense item at HasCoins state.");
        return null;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item) {
        System.out.println("You can't update inventory at HasCoins state.");
    }
}
