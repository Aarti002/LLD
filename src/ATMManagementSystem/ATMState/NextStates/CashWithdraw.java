package ATMManagementSystem.ATMState.NextStates;

import ATMManagementSystem.ATMState.ATMStates;
import ATMManagementSystem.ChainOfResponsibility.CashProvider;
import ATMManagementSystem.ChainOfResponsibility.FiveHundredCash;
import ATMManagementSystem.ChainOfResponsibility.HundredCash;
import ATMManagementSystem.ChainOfResponsibility.TwoThousandCash;
import ATMManagementSystem.Core.ATM;
import ATMManagementSystem.Core.User;

public class CashWithdraw extends ATMStates {
    @Override
    public void updateBalance(ATM atm, User user, int enteredAmt) {
        int userCurrentBalance = user.getCurrentBalance();
        if (enteredAmt > userCurrentBalance) {
            System.out.println("You do not have enough balance in your account. Transection cannot happen.");
            exit(atm);
            return;
        }
        int atmBalance = atm.getAvailableAmount();
        if(atmBalance < enteredAmt) {
            System.out.println("Apologies we do not enough balance. Transection cannot happen.");
            exit(atm);
            return;
        }

        CashProvider cashProvider = new TwoThousandCash(new FiveHundredCash(new HundredCash(null)));
        cashProvider.withdrawAmount(atm, enteredAmt);
        int remainingBalance = userCurrentBalance - enteredAmt;
        user.getAccount().setAmount(remainingBalance);
        atm.updateBalance(enteredAmt);
        exit(atm);
    }

    @Override
    public void exit(ATM atm) {
        System.out.println("Thanks for choosing us!");
        atm.setAtmStates(new Idle());
    }
}
