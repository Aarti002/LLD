package ATMManagementSystem.ChainOfResponsibility;

import ATMManagementSystem.ATMState.NextStates.Idle;
import ATMManagementSystem.Core.ATM;

public class FiveHundredCash extends CashProvider {

    public FiveHundredCash(CashProvider provider) {
        super(provider);
    }

    @Override
    public void withdrawAmount(ATM atm, int requestedAmt) {
        int requiredNotes = (requestedAmt/500);
        int remaining = requestedAmt%500;

        if (requiredNotes<=atm.getFiveHundredsNotes()) {
            atm.deductFiveHundreds(requiredNotes);
        } else {
            System.out.println("Looks like we are out of money, apologies for the inconvenience.");
            atm.setAtmStates(new Idle());
        }

        System.out.println("Five hundred notes: "+requiredNotes);
        if(remaining!=0) {
            this.cashProvider.withdrawAmount(atm, remaining);
        }
    }
}
