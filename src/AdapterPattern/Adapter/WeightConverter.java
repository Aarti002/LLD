package AdapterPattern.Adapter;

import AdapterPattern.Adaptee.WeightMachine;

public class WeightConverter implements IWeightConverter{
    WeightMachine machine;

    public WeightConverter(WeightMachine mch) {
        this.machine = mch;
    }

    @Override
    public double getWeightInKg() {
        int pounds = machine.getWeightInPounds();
        return pounds*(0.45);
    }
}
