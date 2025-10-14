package DecoratorPattern.Decorators;

import DecoratorPattern.Core.PizzaBase;

public class ExtraCheeseDecorator extends ToppingsDecorator {
    PizzaBase pizzaBase;

    public ExtraCheeseDecorator(PizzaBase pizzaBase) {
        this.pizzaBase = pizzaBase;
    }

    @Override
    public String getName() {
        return this.pizzaBase.getName() + " with some Extra Cheese ";
    }

    @Override
    public int price() {
        return this.pizzaBase.price() + 50;
    }
}
