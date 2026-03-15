package IteratorPattern.Aggregate;

public class Menu {
    private String item;
    private String description;
    private double price;

    public Menu(String name, String desc, double amt) {
        this.item = name;
        this.description = desc;
        this.price = amt;
    }

    public String getItem() {
        return item;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
