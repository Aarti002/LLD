package SplitwiseApplication.User;

import SplitwiseApplication.BalanceSheet.UserBalanceSheet;

public class User {
    private int userid;
    private String userName;
    private UserBalanceSheet balanceSheet;

    public User(int id, String name) {
        this.userid = id;
        this.userName = name;
        this.balanceSheet = new UserBalanceSheet();
    }

    public UserBalanceSheet getBalanceSheet() {
        return balanceSheet;
    }

    public int getId() {
        return userid;
    }

    public String getName() {
        return userName;
    }
}
