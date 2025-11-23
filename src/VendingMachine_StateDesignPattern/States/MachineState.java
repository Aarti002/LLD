package VendingMachine_StateDesignPattern.States;

import VendingMachine_StateDesignPattern.Enums.Coins;
import VendingMachine_StateDesignPattern.Utils.Item;
import VendingMachine_StateDesignPattern.VendingMachine.VendingMachine;

import java.util.List;

public interface MachineState {
    String getState();

    boolean insertCoin(VendingMachine machine, Coins coins);

    void insertCoinButton(VendingMachine machine);
    boolean insertCoin(VendingMachine machine, List<Coins> coins);
    void selectItemButton(VendingMachine machine);
    void pressItemCode(VendingMachine machine, int itemCode);

    Item dispenseItem(VendingMachine machine, int itemCode);

    boolean cancelTnx(VendingMachine machine, Item item);
    void returnExtraCoin(Item item, List<Coins> paidAmt);
    Item dispenseItem(VendingMachine machine, Item item);

    void returnExtraCoin(Item item, int paidAmt);

    void updateInventory(VendingMachine machine, Item item);
}
