package ATMManagementSystem.ATMState.NextStates;

import ATMManagementSystem.ATMState.ATMStates;
import ATMManagementSystem.Core.ATM;

public class SelectOperations extends ATMStates {

    private final String cashWithdrawal = "WITHDRAW";
    private final String checkBalance = "BALANCE";

    SelectOperations() {
        System.out.println("Select from following options: ");
        showAllOperations();
    }

    @Override
    public void performOperation(ATM atm, String action) {
        switch (action) {
            case cashWithdrawal:
                atm.setAtmStates(new CashWithdraw());
                break;
            case checkBalance:
                atm.setAtmStates(new CheckBalance());
                break;
            default:
                System.out.println("Wrong operation selected!");
                exit(atm);
        }
    }

    @Override
    public void exit(ATM atm) {
        System.out.println("Thanks for choosing us!");
        atm.setAtmStates(new Idle());
    }

    public void showAllOperations() {
        System.out.println(cashWithdrawal);
        System.out.println(checkBalance);
    }
}
