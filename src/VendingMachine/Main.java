package VendingMachine;

import VendingMachine.Abstract.Drinks;
import VendingMachine.ConcreteAbstract.CocaCola;
import VendingMachine.ConcreteAbstract.WaterDrink;

public class Main {
    public static void main(String[] args) {
        Drinks drinks = new WaterDrink(new CocaCola(null));
        drinks.log(drinks.coke, "is this diet Coke?");
    }
}
