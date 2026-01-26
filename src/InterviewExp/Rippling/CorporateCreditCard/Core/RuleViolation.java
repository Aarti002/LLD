package InterviewExp.Rippling.CorporateCreditCard.Core;

import InterviewExp.Rippling.CorporateCreditCard.Enums.ConditionExp;

public class RuleViolation {
    private Rule ruleDetails;
    private String violationMsg;
    private ConditionExp conditionExp;
    private Expense expenseDetails;

    public RuleViolation() {

    }

    public Expense getExpenseDetails() {
        return expenseDetails;
    }

    public void setExpenseDetails(Expense expenseDetails) {
        this.expenseDetails = expenseDetails;
    }

    public ConditionExp getConditionExp() {
        return conditionExp;
    }

    public void setConditionExp(ConditionExp conditionExp) {
        this.conditionExp = conditionExp;
    }

    public String getViolationMsg() {
        return violationMsg;
    }

    public void setViolationMsg(String violationMsg) {
        this.violationMsg = violationMsg;
    }

    public Rule getRuleDetails() {
        return ruleDetails;
    }

    public void setRuleDetails(Rule ruleDetails) {
        this.ruleDetails = ruleDetails;
    }


}
