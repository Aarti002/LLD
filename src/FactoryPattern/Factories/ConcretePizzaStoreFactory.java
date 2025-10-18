package FactoryPattern.Factories;

import AbstractFactoryPattern.Interfaces.Pizza;
import FactoryPattern.ConcretePizza.CheesePizza;
import FactoryPattern.ConcretePizza.JalapenoPizza;
import FactoryPattern.ConcretePizza.MacNCheesePizza;

public class ConcretePizzaStoreFactory extends PizzaStoreFactory {

    @Override
    public Pizza createPizza(String name) {
        if (name.equals("Cheese")) {
            return new CheesePizza();
        } else if (name.equals("Jalapeno")){
            return new JalapenoPizza();
        } else if(name.equals("MacNCheese")) {
            return new MacNCheesePizza();
        }
        return null;
    }
}
