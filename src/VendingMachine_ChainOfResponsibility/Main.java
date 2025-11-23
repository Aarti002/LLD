package VendingMachine_ChainOfResponsibility;

import VendingMachine_ChainOfResponsibility.Abstract.Drinks;
import VendingMachine_ChainOfResponsibility.ConcreteAbstract.CocaCola;
import VendingMachine_ChainOfResponsibility.ConcreteAbstract.WaterDrink;

public class Main {
    public static void main(String[] args) {
        Drinks drinks = new WaterDrink(new CocaCola(null));
        drinks.log(drinks.coke, "is this diet Coke?");
    }
}
