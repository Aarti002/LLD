package DecoratorPattern.Decorators;

import DecoratorPattern.Core.PizzaBase;

public abstract class ToppingsDecorator extends PizzaBase {
    @Override
    public abstract String getName();
}