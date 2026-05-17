package SplitwiseApplication;

import SplitwiseApplication.BalanceSheet.UserBalanceSheetController;
import SplitwiseApplication.Expense.Expense;
import SplitwiseApplication.Expense.ExpenseController;
import SplitwiseApplication.Split.Enum.SplitType;
import SplitwiseApplication.Split.Split;
import SplitwiseApplication.Split.Strategy.EqualSplits;
import SplitwiseApplication.Split.Strategy.SplitStrategy;
import SplitwiseApplication.Split.Strategy.UnequalSplits;
import SplitwiseApplication.User.User;
import SplitwiseApplication.User.UserController;

import java.util.ArrayList;
import java.util.List;

public class SplitwiseApp {
    static void main(String[] args) {
        UserBalanceSheetController balanceSheetController = new UserBalanceSheetController();

        UserController userController = new UserController();
        userController.createUser("Alice");
        userController.createUser("Bob");
        userController.createUser("John");

        // Alice paid for Dinner - UNEQUAL Split
        SplitStrategy strategy = new UnequalSplits();
        List<Integer> chrg1 = new ArrayList<>(List.of(25, 35, 40));
        List<Split> dinnerSplit = strategy.createSplits(userController.getUsers(), 700.0, chrg1);

//        dinnerSplit.add(new Split(userController.getUser(0), 200.0, 33));
//        dinnerSplit.add(new Split(userController.getUser(1), 150.0, 33));
//        dinnerSplit.add(new Split(userController.getUser(2), 350.0, 33));

        ExpenseController expenseController = new ExpenseController();
        Expense dinnerExpense = expenseController.createExpense("Dinner Expense",
                userController.getUser(0), dinnerSplit, 700.0, SplitType.UNEQUAL);

        // Bob paid for Movie - EQUAL Split
        strategy = new EqualSplits();
        List<Integer> chrg2 = new ArrayList<>(List.of(33, 33, 33));
        List<Split> movieSplit = strategy.createSplits(userController.getUsers(), 750.0, chrg2);
//        movieSplit.add(new Split(userController.getUser(0), 250.0, 33));
//        movieSplit.add(new Split(userController.getUser(1), 250.0, 33));
//        movieSplit.add(new Split(userController.getUser(2), 250.0, 33));

        Expense movieExpense = expenseController.createExpense( "Movie Expense",
                userController.getUser(1), movieSplit, 750.0, SplitType.EQUAL);

        // Alice paid for Games - PERCENTAGE Split
        strategy = new UnequalSplits();
        List<Integer> chrg3 = new ArrayList<>(List.of(30, 30, 40));
        List<Split> gamesSplit = strategy.createSplits(userController.getUsers(), 1000.0, chrg3);

//        gamesSplit.add(new Split(userController.getUser(0), 400.0, 40));
//        gamesSplit.add(new Split(userController.getUser(1), 300.0, 30));
//        gamesSplit.add(new Split(userController.getUser(2), 300.0, 30));

        Expense gamesExpense = expenseController.createExpense("Games Expense",
                userController.getUser(0), gamesSplit, 1000.0, SplitType.PERCENTAGE);


        List<User> allUsers = userController.getUsers();
        for(User u:allUsers) {
            System.out.println(u.getName()+" balance sheet: ");
            balanceSheetController.printBalanceSheet(u);
        }

//alice - 700, 1000
        //bob - 750

        //alice-250,bob
        //bob-150,alice:300, alice
        //john-250,bob: 650,alice: 300, alice
    }
}
