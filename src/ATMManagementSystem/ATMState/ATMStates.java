package ATMManagementSystem.ATMState;

import ATMManagementSystem.Core.ATM;
import ATMManagementSystem.Core.Card;
import ATMManagementSystem.Core.User;

public abstract class ATMStates {

    public void insertCard(ATM atm, Card card) {
        System.out.println("Not an appropriate operation for current state!");
    }

    public void authenticateUser(ATM atm, int pin, Card card) {
        System.out.println("Not an appropriate operation for current state!");
    }

    public void performOperation(ATM atm, String action) {
        System.out.println("Not an appropriate operation for current state!");
    }

    public void updateBalance(ATM atm, User user, int amt) {
        System.out.println("Not an appropriate operation for current state!");
    }

    public void checkBalance(ATM atm, User user) {
        System.out.println("Not an appropriate operation for current state!");
    }

    public void exit(ATM atm) {
        System.out.println("Not an appropriate operation for current state!");
    }
}
