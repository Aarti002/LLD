package FactoryPattern;

import FactoryPattern.Factories.ConcretePizzaStoreFactory;
import FactoryPattern.Factories.PizzaStoreFactory;

public class PizzaBakeryController {
    public static void main(String args[]) {
        PizzaStoreFactory pizzaFactory = new ConcretePizzaStoreFactory();

        pizzaFactory.orderPizza("Jalapeno");
        pizzaFactory.orderPizza("Cheese");
    }
}
