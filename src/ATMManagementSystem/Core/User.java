package ATMManagementSystem.Core;

public class User {
    private BankAccount account;
    private Card card;

    public User(BankAccount acct, Card card) {
        this.account = acct;
        this.card = card;
    }

    public int getCurrentBalance() {
        return account.getAmount();
    }

    public Card getCard() {
        return card;
    }

    public BankAccount getAccount() {
        return account;
    }
}
