package AbstractFactoryPattern;

import AbstractFactoryPattern.ConcretePizza.NYCheesePizza;
import AbstractFactoryPattern.ConcretePizza.NYJalapenoPizza;
import AbstractFactoryPattern.Factories.ChicagoPizzaStoreFactory;
import AbstractFactoryPattern.Factories.NYPizzaStoreFactory;
import AbstractFactoryPattern.Factories.PizzaStoreFactory;

import java.util.ArrayList;
import java.util.List;

public class PizzaBakeryController {
    public static void main(String args[]) {
        PizzaStoreFactory nyFactory = new NYPizzaStoreFactory();
        List<String> toppings = new ArrayList<>();
        toppings.add("Cheese");
        toppings.add("Onion");
        toppings.add("Capsicum");
        nyFactory.orderPizza("Jalapeno", toppings);

        toppings.remove("Cheese");
        nyFactory.orderPizza("Cheese", toppings);

        PizzaStoreFactory chicagoFactory = new ChicagoPizzaStoreFactory();
        List<String> toppings1 = new ArrayList<>();
        toppings1.add("Cheese");
        toppings1.add("Onion");
        chicagoFactory.orderPizza("Jalapeno", toppings1);

        toppings1.remove("Cheese");
        chicagoFactory.orderPizza("Cheese", toppings1);
    }
}
