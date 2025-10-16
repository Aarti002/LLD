package AbstractFactoryPattern.Factories;

import AbstractFactoryPattern.ConcretePizza.ChicagoCheesePizza;
import AbstractFactoryPattern.ConcretePizza.ChicagoJalapenoPizza;
import AbstractFactoryPattern.Interfaces.Pizza;

import java.util.List;

public class ChicagoPizzaStoreFactory extends PizzaStoreFactory {
    @Override
    public Pizza bakePizza(String name, List<String> toppings) {
        if(name.equals("Cheese")) {
            return new ChicagoCheesePizza(name, toppings);
        } else if(name.equals("Jalapeno")) {
            return new ChicagoJalapenoPizza(name, toppings);
        }
        return null;
    }
}
