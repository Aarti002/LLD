package ATMManagementSystem.Core;

public class BankAccount {
    private static final String branchName = "Ballendur Branch";
    private static final String accountNum = "57483920";
    private static final String ifscCode = "239856";
    private int amount = 0;

    public BankAccount(int amt) {
        amount = amt;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int newAmount) {
        this.amount = newAmount;
    }
}
