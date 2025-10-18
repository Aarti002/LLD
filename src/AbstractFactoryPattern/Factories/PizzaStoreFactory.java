package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.Interfaces.Pizza;

import java.util.List;

public abstract class PizzaStoreFactory {
    public void orderPizza(String pizzaName, List<String> toppings) {
        Pizza order = bakePizza(pizzaName, toppings);
        order.prepare();
        order.cutPieces();
        order.ready();
    }

    abstract public Pizza bakePizza(String name, List<String> toppings);
}
