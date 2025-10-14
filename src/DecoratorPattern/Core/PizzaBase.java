package DecoratorPattern.Core;

public abstract class PizzaBase {
    protected String name = "Pizza";

    public String getName() {
        return this.name;
    }

    public abstract int price();
}
