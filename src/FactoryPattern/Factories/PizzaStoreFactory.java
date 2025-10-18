package FactoryPattern.Factories;

import AbstractFactoryPattern.Interfaces.Pizza;

public abstract class PizzaStoreFactory {
    public void orderPizza(String name) {
        Pizza pizza = createPizza(name);
        pizza.prepare();
        pizza.cutPieces();
        pizza.ready();
    }

    public abstract Pizza createPizza(String name);
}
