package VendingMachine.ConcreteAbstract;

import VendingMachine.Abstract.Drinks;

public class CocaCola extends Drinks {
    public CocaCola(Drinks type) {
        super(type);
    }

    @Override
    public void log(String type, String msg) {
        if(type == coke) {
            System.out.println("Coca-cola: "+msg);
        } else if(type!=null) {
            nextType.log(type, msg);
        }
    }
}
