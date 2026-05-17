package SplitwiseApplication.BalanceSheet;

import SplitwiseApplication.Split.Split;
import SplitwiseApplication.User.User;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserBalanceSheetController {

    public void updateUserBalanceSheet(User paidBy, List<Split> splits) {
        for(Split s:splits) {
            if(paidBy != s.getUser()) {
                Double toBePaid = 0.0;
                Set<User> availableUsers = s.getUser().getBalanceSheet().getSheet().keySet();
                if (availableUsers.contains(paidBy)) {
                    toBePaid = s.getUser().getBalanceSheet().getSheet().get(paidBy);
                    toBePaid+=(-1.0*s.getAmt());
                } else {
                    toBePaid = (-1.0*s.getAmt());
                }
                s.getUser().getBalanceSheet().updateSheet(paidBy, toBePaid);
            }
        }
    }

    public void printBalanceSheet(User user) {
        UserBalanceSheet sheet = user.getBalanceSheet();
        Map<User, Double> amtDueOwn = sheet.getSheet();
        amtDueOwn.forEach((key, value) -> {
            System.out.println("Paid By: " + key.getName() + ", Amount Due/Own: " + value);
        });
    }
}
