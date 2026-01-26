package InterviewExp.Rippling.CorporateCreditCard.Core;

import InterviewExp.Rippling.CorporateCreditCard.Enums.ExpenseType;

public class Expense {
    private String expenseId;
    private String vendorName;
    private ExpenseType expenseType;
    private String expenseDesc;
    private Double expenseAmt;

    public Expense(String expId, String vendorName, ExpenseType type, Double expenseAmt) {
        this.expenseId=expId;
        this.expenseType=type;
        this.vendorName=vendorName;
        this.expenseAmt=expenseAmt;
    }

    public Double getExpenseAmt() {
        return expenseAmt;
    }

    public void setExpenseAmt(Double expenseAmt) {
        this.expenseAmt = expenseAmt;
    }

    public String getExpenseDesc() {
        return expenseDesc;
    }

    public void setExpenseDesc(String expenseDesc) {
        this.expenseDesc = expenseDesc;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(String expenseId) {
        this.expenseId = expenseId;
    }
}
