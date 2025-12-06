package ATMManagementSystem.ChainOfResponsibility;

import ATMManagementSystem.ATMState.NextStates.Idle;
import ATMManagementSystem.Core.ATM;

public class TwoThousandCash extends CashProvider {

    public TwoThousandCash(CashProvider provider) {
        super(provider);
    }

    @Override
    public void withdrawAmount(ATM atm, int requestedAmt) {
        int requiredNotes = (requestedAmt/2000);
        int remaining = requestedAmt%2000;

        if (requiredNotes<=atm.getTwoThousandsNotes()) {
            atm.deductTwoThousands(requiredNotes);
        } else {
            System.out.println("Looks like we are out of money, apologies for the inconvenience.");
            atm.setAtmStates(new Idle());
        }
        System.out.println("Two thousands notes: "+requiredNotes);
        if(remaining!=0) {
            this.cashProvider.withdrawAmount(atm, remaining);
        }

    }
}
