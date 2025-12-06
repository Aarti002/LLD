package ATMManagementSystem.ATMState.NextStates;

import ATMManagementSystem.ATMState.ATMStates;
import ATMManagementSystem.Core.ATM;
import ATMManagementSystem.Core.User;

public class CheckBalance extends ATMStates {
    @Override
    public void checkBalance(ATM atm, User user) {
        double amt = user.getCurrentBalance();
        System.out.println("Available Balance: "+amt);
        exit(atm);
    }

    @Override
    public void exit(ATM atm) {
        System.out.println("Thanks for choosing us!");
        atm.setAtmStates(new Idle());
    }
}
