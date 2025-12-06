package ATMManagementSystem;

import ATMManagementSystem.Core.ATM;
import ATMManagementSystem.Core.BankAccount;
import ATMManagementSystem.Core.Card;
import ATMManagementSystem.Core.User;

import java.util.Scanner;

public class ATMController {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(10000);
        Card userDebitCard = new Card("Aarti");
        User user = new User(userAccount, userDebitCard);

        ATM atm = new ATM(4, 4, 4);

        atm.printCurrentState();

        Scanner scanner = new Scanner(System.in);
        atm.getAtmState().insertCard(atm, user.getCard());
        int providePin = scanner.nextInt();

        atm.printCurrentState();

        atm.getAtmState().authenticateUser(atm, providePin, user.getCard());

        atm.printCurrentState();

        String selectedOperation = scanner.next();

        atm.getAtmState().performOperation(atm, selectedOperation);

        if (selectedOperation.equals("WITHDRAW")) {
            System.out.println("Enter the amount you would like to withdraw: ");
            int amt = scanner.nextInt();
            atm.getAtmState().updateBalance(atm, user, amt);
        } else {
            atm.getAtmState().checkBalance(atm, user);
        }
        System.out.println("ATM available balance: "+atm.getAvailableAmount());

        atm.printCurrentState();

    }
}
