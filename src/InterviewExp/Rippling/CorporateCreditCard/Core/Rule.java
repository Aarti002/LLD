package InterviewExp.Rippling.CorporateCreditCard.Core;

import InterviewExp.Rippling.CorporateCreditCard.Enums.ExpenseType;

public class Rule {
    private String ruleKey;
    private boolean isAllowed;
    private ExpenseType expenseType;
    private Double maxAmt;

    public Rule(String key, ExpenseType type) {
        this.ruleKey = key;
        this.expenseType = type;
    }

    public String getRuleKey() {
        return ruleKey;
    }

    public void setRuleKey(String ruleKey) {
        this.ruleKey = ruleKey;
    }

    public boolean isAllowed() {
        return isAllowed;
    }

    public void setAllowed(boolean allowed) {
        isAllowed = allowed;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }

    public Double getMaxAmt() {
        return maxAmt;
    }

    public void setMaxAmt(Double maxAmt) {
        this.maxAmt = maxAmt;
    }

}
