package SplitwiseApplication.Expense;

import SplitwiseApplication.BalanceSheet.UserBalanceSheet;
import SplitwiseApplication.BalanceSheet.UserBalanceSheetController;
import SplitwiseApplication.Split.ConcreteSplit.ExpenseSplit;
import SplitwiseApplication.Split.Factory.SplitFactory;
import SplitwiseApplication.Split.Split;
import SplitwiseApplication.Split.Enum.SplitType;
import SplitwiseApplication.User.User;

import java.util.ArrayList;
import java.util.List;

public class ExpenseController {
    List<Expense> allExp;
    UserBalanceSheetController sheetController;

    public ExpenseController() {
        this.allExp = new ArrayList<>();
        this.sheetController = new UserBalanceSheetController();
    }

    public Expense createExpense(String desc, User paidBy, List<Split> splits,
                                 Double amt, SplitType type) {
        ExpenseSplit expSplit = SplitFactory.createSplit(type);
        boolean isRight = expSplit.validateSplit(splits, amt);
        if(isRight)
        {
            Expense expense = new Expense(allExp.size(), desc, type, paidBy);
            allExp.add(expense);
            sheetController.updateUserBalanceSheet(paidBy, splits);
            System.out.println("Expense Validation passed, generated successfully.");
            return expense;
        }
        System.out.println("Expense Validation failed, could not create one.");
        return null;
    }
}
