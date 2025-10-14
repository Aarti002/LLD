package DecoratorPattern.Decorators;

import DecoratorPattern.Core.PizzaBase;

public class MushroomDecorator extends ToppingsDecorator {
    PizzaBase pizzaBase;

    public MushroomDecorator(PizzaBase pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    @Override
    public String getName() {
        return this.pizzaBase.getName() + " with Mushrooms ";
    }

    @Override
    public int price() {
        return this.pizzaBase.price() + 80;
    }
}
