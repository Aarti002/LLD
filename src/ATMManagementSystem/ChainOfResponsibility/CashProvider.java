package ATMManagementSystem.ChainOfResponsibility;

import ATMManagementSystem.Core.ATM;

public abstract class CashProvider {
    CashProvider cashProvider;

    CashProvider(CashProvider provider) {
        this.cashProvider = provider;
    }

    public void withdrawAmount(ATM atm, int requestedAmt) {
        if (cashProvider!=null) {
            this.withdrawAmount(atm, requestedAmt);
        }
    }
}
