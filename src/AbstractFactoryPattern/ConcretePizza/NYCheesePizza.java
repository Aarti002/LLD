package AbstractFactoryPattern.ConcretePizza;

import AbstractFactoryPattern.Interfaces.Pizza;

import java.util.List;

public class NYCheesePizza implements Pizza {
    String name;
    List<String> toppings;

    public NYCheesePizza(String name, List<String> toppings) {
        this.name = name;
        this.toppings = toppings;
    }

    @Override
    public void prepare() {
        System.out.println("Pizza "+this.name+" will be ready soon.");
        System.out.println("As per order "+this.name+" will be served with "+this.toppings.size()+" varieties of toppings which includes: ");
        for (String topping : this.toppings) {
            System.out.println(topping);
        }
    }

    @Override
    public void cutPieces() {
        System.out.println("Cutting "+this.name+" into pieces making it ready to serve!");
    }

    @Override
    public void ready() {
        System.out.println("Your "+this.name+" is ready to pick up.");
    }
}
