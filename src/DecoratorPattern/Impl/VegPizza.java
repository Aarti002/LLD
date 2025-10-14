package DecoratorPattern.Impl;

import DecoratorPattern.Core.PizzaBase;

public class VegPizza extends PizzaBase {
    @Override
    public int price() {
        return 100;
    }
}
