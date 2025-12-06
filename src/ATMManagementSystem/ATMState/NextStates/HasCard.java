package ATMManagementSystem.ATMState.NextStates;

import ATMManagementSystem.ATMState.ATMStates;
import ATMManagementSystem.Core.ATM;
import ATMManagementSystem.Core.Card;

public class HasCard extends ATMStates {
    @Override
    public void authenticateUser(ATM atm, int enteredPin, Card card) {
        boolean isValid = card.validatePin(enteredPin);
        if (isValid) {
            atm.setAtmStates(new SelectOperations());
        } else {
           System.out.println("You have entered wrong pin!");
           exit(atm);
        }
    }

    @Override
    public void exit(ATM atm) {
        System.out.println("Thanks for choosing us!");
        atm.setAtmStates(new Idle());
    }
}
