package VendingMachine_StateDesignPattern;

import VendingMachine_StateDesignPattern.Enums.Coins;
import VendingMachine_StateDesignPattern.Utils.Item;
import VendingMachine_StateDesignPattern.VendingMachine.VendingMachine;

public class VendingMachineController {

    public static void main(String[] args) {

        VendingMachine vm = new VendingMachine();

        Item cocaCola = new Item("Coca-Cola", 101, Coins.TEN_RUPEES);
        Item pepsi = new Item("Pepsi", 102, Coins.FIVE_RUPEES);
        Item cake = new Item("Britania-Cake", 201, Coins.FIVE_RUPEES);

        vm.updateInventory(cocaCola, false);
        vm.updateInventory(pepsi, false);
        vm.updateInventory(cake, false);

        vm.displayInventory();

        // 1. IDLE → HAS_COINS
        vm.getCurrentState().insertCoinButton(vm);

        // 2. Insert coin
        vm.getCurrentState().insertCoin(vm, Coins.TEN_RUPEES);

        // 3. HAS_COINS → ITEM_SELECTION
        vm.getCurrentState().selectItemButton(vm);

        // 4. Press Item Code (ITEM_SELECTION → DISPENSING)
        vm.getCurrentState().pressItemCode(vm, 101);

        // 5. DISPENSE ITEM
        Item dispensedItem = vm.getCurrentState().dispenseItem(vm, 101);

        // Final inventory
        System.out.println("\nUpdated Inventory:");
        vm.displayInventory();
    }
}
