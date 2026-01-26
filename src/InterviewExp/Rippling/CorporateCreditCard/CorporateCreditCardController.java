/*
We plan to offer a corporate credit card to companies that employees can use for business expenses.
Managers can set policies on the cards so that employees do not misuse the card or exceed allowances.
We're going to be building the rules engine that supports this product.
You are encouraged to ask product-oriented questions and to share your assumptions.

We will start with some very basic rules:

* No expense at a `restaurant` can exceed $75
* No `airfare` expenses
* No `entertainment` expenses
* No expenses over $250

Let's design a system to handle these rules and flag expenses that violate them.
Implement the following function:

```
evaluateRules(rules: list<Rule>, expenses: list<Expense>) -> ???
```

Expenses will be provided to you as a list of hashmap/dictionary objects with `string` keys and values.

The return type of evaluateRules is up to you.

In the future, we will add more types of rules and allow rule creation via an API, so we encourage you to think about the flexibility of your design.

Here is the expected output for the example expenses below:

* Expense "003" is a meal at a restaurant that cost over $75 so should be reviewed.
* Expense "004" is both an airfare, and over $250 so should be reviewed.
* Expense "007" is entertainment so should be reviewed.
*/


package InterviewExp.Rippling.CorporateCreditCard;

import InterviewExp.Rippling.CorporateCreditCard.Core.Expense;
import InterviewExp.Rippling.CorporateCreditCard.Core.Rule;
import InterviewExp.Rippling.CorporateCreditCard.Enums.ExpenseType;
import InterviewExp.Rippling.CorporateCreditCard.Services.ExpenseReimbursementService;
import InterviewExp.Rippling.CorporateCreditCard.Services.RuleManager;

import java.util.ArrayList;
import java.util.List;

public class CorporateCreditCardController {
    public static void main(String[] args) {
        List<Expense> empExpenseList = new ArrayList<>();

        Rule rule_1 = new Rule("rule_1", ExpenseType.MEAL);
        rule_1.setAllowed(true);
        rule_1.setMaxAmt(75.0);

        Rule rule_2 = new Rule("rule_2", ExpenseType.AIRFARE);
        rule_2.setAllowed(false);

        Rule rule_3 = new Rule("rule_3", ExpenseType.ENTERTAINMENT);
        rule_3.setAllowed(false);

        Rule rule_4 = new Rule("rule_4", ExpenseType.LIMITATION);
        rule_4.setAllowed(true);
        rule_4.setMaxAmt(250.0);

        RuleManager ruleManager = new RuleManager();

        ruleManager.addNewRule(rule_1);
        ruleManager.addNewRule(rule_2);
        ruleManager.addNewRule(rule_3);
        ruleManager.addNewRule(rule_4);


        ruleManager.getRulesDetails();

        Expense exp_1 = new Expense("exp_1", "Lavonne", ExpenseType.MEAL, 112.0);
        Expense exp_2 = new Expense("exp_2", "Indigo", ExpenseType.AIRFARE, 3500.0);
        Expense exp_3 = new Expense("exp_3", "PVR", ExpenseType.ENTERTAINMENT, 750.0);
        Expense exp_4 = new Expense("exp_4", "Reliance", ExpenseType.MEAL, 74.5);
        Expense exp_5 = new Expense("exp_5", "Uber", ExpenseType.COMMUTE_TO_OFFICE, 50.0);
        Expense exp_6 = new Expense("exp_6", "Udupi", ExpenseType.MEAL, 100.0);
        Expense exp_7 = new Expense("exp_7", "Rapido", ExpenseType.COMMUTE_TO_OFFICE, 50.0);

        empExpenseList.add(exp_1);
        empExpenseList.add(exp_2);
        empExpenseList.add(exp_3);
        empExpenseList.add(exp_4);
        empExpenseList.add(exp_5);
        empExpenseList.add(exp_6);
        empExpenseList.add(exp_7);

        ExpenseReimbursementService handler = new ExpenseReimbursementService(ruleManager.getRulesList(), empExpenseList);
        handler.extractViolatedExpenses();
        if (handler.hasExpenseLimitExceeded(ruleManager.getLimitationRule())) {
            handler.addViolation(ruleManager.getLimitationRule());
        }
        handler.printViolatedExpenses();

    }
}
