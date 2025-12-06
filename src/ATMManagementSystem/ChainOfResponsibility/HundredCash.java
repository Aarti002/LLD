package ATMManagementSystem.ChainOfResponsibility;

import ATMManagementSystem.ATMState.NextStates.Idle;
import ATMManagementSystem.Core.ATM;

public class HundredCash extends CashProvider {

    public HundredCash(CashProvider provider) {
        super(provider);
    }

    @Override
    public void withdrawAmount(ATM atm, int requestedAmt) {
        int requiredNotes = (requestedAmt/100);
        int remaining = requestedAmt%100;

        if (requiredNotes<=atm.getHundredsNotes()) {
            atm.deductHundreds(requiredNotes);
        } else {
            System.out.println("Looks like we are out of money, apologies for the inconvenience.");
            atm.setAtmStates(new Idle());
        }
        System.out.println("Hundred notes: "+requiredNotes);
        if(remaining>0 && remaining<100){
            System.out.println("We do not provide notes less than 100.");
            return;
        }
        if(remaining!=0) {
            this.cashProvider.withdrawAmount(atm, remaining);
        }
    }
}
