package VendingMachine_ChainOfResponsibility.ConcreteAbstract;

import VendingMachine_ChainOfResponsibility.Abstract.Drinks;

public class WaterDrink extends Drinks {
    public WaterDrink(Drinks type) {
        super(type);
    }

    public void log(String type, String msg) {
        if(type == water) {
            System.out.println("Water: "+msg);
        } else if(type!=null){
            nextType.log(type, msg);
        }
    }
}
