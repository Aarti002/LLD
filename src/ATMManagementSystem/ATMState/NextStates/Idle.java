package ATMManagementSystem.ATMState.NextStates;

import ATMManagementSystem.ATMState.ATMStates;
import ATMManagementSystem.Core.ATM;
import ATMManagementSystem.Core.Card;

public class Idle extends ATMStates {
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card Inserted Successfully, please provide PIN.....");
        atm.setAtmStates(new HasCard());
    }

    @Override
    public void exit(ATM atm) {
        System.out.println("Thanks for choosing us!");
        atm.setAtmStates(new Idle());
    }
}
