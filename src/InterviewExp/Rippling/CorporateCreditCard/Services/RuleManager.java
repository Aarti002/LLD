package InterviewExp.Rippling.CorporateCreditCard.Services;

import InterviewExp.Rippling.CorporateCreditCard.Core.Rule;
import InterviewExp.Rippling.CorporateCreditCard.Enums.ExpenseType;

import java.util.ArrayList;
import java.util.List;

public class RuleManager {
    private List<Rule> rules;

    public RuleManager() {
        this.rules = new ArrayList<>();
    }

    public boolean addNewRule(Rule newRule) {
        if(isPresent(newRule)) {
            System.out.println("Looks like given rule already exist in the system.");
            return false;
        }
        rules.add(newRule);
        return true;
    }

    public void disableRule(String ruleKey) {
        for(Rule r:rules) {
            if(r.getRuleKey() == ruleKey) {
                r.setAllowed(false);
            }
        }
    }

    public void enableRule(String ruleKey){
        for(Rule r:rules) {
            if(r.getRuleKey() == ruleKey) {
                r.setAllowed(true);
            }
        }
    }

    public void getRulesDetails() {
        System.out.println("Below are current Rule details: ");
        for(Rule r:rules) {
            System.out.println("Rule Key: "+r.getRuleKey());
            System.out.println("Rule Expense Type: "+r.getExpenseType());
            System.out.println("Rule Max Amount Limit: "+r.getMaxAmt());
        }
    }

    public List<Rule> getRulesList() {
        return rules;
    }

    public Rule getLimitationRule() {
        for(Rule r:rules) {
            if(r.getExpenseType() == ExpenseType.LIMITATION) {
                return r;
            }
        }
        return null;
    }

    private boolean isPresent(Rule rule) {
        for(Rule r:rules) {
            if(r.getRuleKey() == rule.getRuleKey()) {
                return true;
            }
        }
        return false;
    }
}
