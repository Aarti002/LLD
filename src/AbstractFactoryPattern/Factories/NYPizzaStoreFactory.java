package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.ConcretePizza.NYCheesePizza;
import AbstractFactoryPattern.ConcretePizza.NYJalapenoPizza;
import AbstractFactoryPattern.Interfaces.Pizza;

import java.util.List;

public class NYPizzaStoreFactory extends PizzaStoreFactory {
    @Override
    public Pizza bakePizza(String name, List<String> toppings) {
        if(name.equals("Cheese")) {
            return new NYCheesePizza(name, toppings);
        } else if(name.equals("Jalapeno")) {
            return new NYJalapenoPizza(name, toppings);
        }
        return null;
    }

}
