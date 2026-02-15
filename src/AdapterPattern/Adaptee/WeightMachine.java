package AdapterPattern.Adaptee;

public class WeightMachine implements IWeightMachine{

    @Override
    public int getWeightInPounds() {
        return 28;
    }
}
