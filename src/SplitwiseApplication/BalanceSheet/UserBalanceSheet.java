package SplitwiseApplication.BalanceSheet;

import SplitwiseApplication.User.User;

import java.util.HashMap;
import java.util.Map;

public class UserBalanceSheet {
    private Map<User, Double> amtToClear;

    public UserBalanceSheet() {
        this.amtToClear = new HashMap<>();
    }

    public void updateSheet(User ownBy, Double amt) {
        amtToClear.put(ownBy, amt);
    }

    public Map<User, Double> getSheet() {
        return amtToClear;
    }
}
