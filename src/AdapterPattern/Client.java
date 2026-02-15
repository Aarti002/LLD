package AdapterPattern;

import AdapterPattern.Adaptee.WeightMachine;
import AdapterPattern.Adapter.WeightConverter;

public class Client {
    public static void main(String[] args) {
        WeightConverter wgtInKg = new WeightConverter(new WeightMachine());

        System.out.println("Weight in Kgs: "+wgtInKg.getWeightInKg());
    }
}
