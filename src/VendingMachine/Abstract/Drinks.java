package VendingMachine.Abstract;

public abstract class Drinks {
    public static final String coke = "Coca";
    public static final String water = "Water";
    public Drinks nextType;

    public Drinks(Drinks type) {
        this.nextType = type;
    }

    public abstract void log(String type, String msg);

}
