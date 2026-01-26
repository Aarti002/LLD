package InterviewExp.Rippling.CorporateCreditCard.Services;

import InterviewExp.Rippling.CorporateCreditCard.Core.Expense;
import InterviewExp.Rippling.CorporateCreditCard.Core.Rule;
import InterviewExp.Rippling.CorporateCreditCard.Core.RuleViolation;
import InterviewExp.Rippling.CorporateCreditCard.Enums.ConditionExp;
import InterviewExp.Rippling.CorporateCreditCard.Enums.ExpenseType;

import java.util.ArrayList;
import java.util.List;

public class ExpenseReimbursementService {
    List<Rule> currentRules;
    List<Expense> toBeReimbursed;
    List<RuleViolation> violatedExp;
    Double totalExpAmt;

    public ExpenseReimbursementService(List<Rule> rules, List<Expense> exp) {
        this.currentRules = rules;
        this.toBeReimbursed = exp;
        this.totalExpAmt = 0.0;
        this.violatedExp = new ArrayList<>();
    }

    public void extractViolatedExpenses() {

        for(Expense exp:toBeReimbursed) {
                boolean flag=true;
                for(Rule r:currentRules) {
                    ExpenseType ruleExpType = r.getExpenseType();
                    ExpenseType expenseType = exp.getExpenseType();
                    RuleViolation violation = new RuleViolation();
                    String msg;
                    if (expenseType != ruleExpType) {
                        continue;
                    }
                    if(r.isAllowed()) {
                        boolean amtLimitChk = hasExceedAmtLimit(r.getMaxAmt(), exp.getExpenseAmt());
                        if (amtLimitChk) {
                            msg = "Max Amount Limit Exceed.";
                            violation.setRuleDetails(r);
                            violation.setExpenseDetails(exp);
                            violation.setViolationMsg(msg);
                            violatedExp.add(violation);
                            flag=false;
                        }
                    } else {
                        msg = r.getExpenseType() + " is not allowed.";
                        violation.setExpenseDetails(exp);
                        violation.setRuleDetails(r);
                        violation.setViolationMsg(msg);
                        violatedExp.add(violation);
                        flag=false;
                    }


                }
                if(flag) {
                    totalExpAmt +=exp.getExpenseAmt();
                }

        }
    }

    public boolean hasExpenseLimitExceeded(Rule rule) {
        return rule.getMaxAmt() > totalExpAmt;
    }

    public void addViolation(Rule rule) {
        RuleViolation violation = new RuleViolation();
        violation.setRuleDetails(rule);
        violation.setViolationMsg("You have exceeded card limit by "+(totalExpAmt - rule.getMaxAmt()));
        violatedExp.add(violation);
    }

    public void printViolatedExpenses() {
        System.out.println("Below Expenses are violating Rule/s:");
        for(RuleViolation rv:violatedExp) {
            System.out.println("Rule:"+rv.getRuleDetails().getRuleKey());
            if(rv.getExpenseDetails()!=null) {
                System.out.println("Expense:"+rv.getExpenseDetails().getExpenseId());
            }

            System.out.println("Msg:"+rv.getViolationMsg());
            System.out.println("------------------------");
        }
    }

    private boolean hasExceedAmtLimit(Double amtLimit, Double expAmt) {
        return expAmt > amtLimit;
    }

}
