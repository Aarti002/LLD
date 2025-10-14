package DecoratorPattern.Impl;

import DecoratorPattern.Core.PizzaBase;

public class NonVegPizza extends PizzaBase {
    @Override
    public int price() {
        return 120;
    }
}
