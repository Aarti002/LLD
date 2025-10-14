package DecoratorPattern;

import DecoratorPattern.Core.PizzaBase;
import DecoratorPattern.Decorators.ExtraCheeseDecorator;
import DecoratorPattern.Decorators.MushroomDecorator;
import DecoratorPattern.Impl.VegPizza;

public class BakeryController {
    public static void main(String args[]) {
        VegPizza vegBase = new VegPizza();
        PizzaBase vegPizza = new MushroomDecorator(new ExtraCheeseDecorator(vegBase));

        int totalPrice = vegPizza.price();
        System.out.println(vegPizza.getName());
        System.out.print("Amount to pay: ");
        System.out.println(totalPrice);
    }
}
