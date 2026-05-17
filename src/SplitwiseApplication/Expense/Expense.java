package SplitwiseApplication.Expense;

import SplitwiseApplication.Split.Split;
import SplitwiseApplication.Split.Enum.SplitType;
import SplitwiseApplication.User.User;

import java.util.List;

public class Expense {
    private int expId;
    private String expDesc;
    private SplitType splitType;
    private User paidBy;
    private List<Split> splits;

    public Expense(int expId, String expDesc, SplitType splitType, User paidBy) {
        this.expId = expId;
        this.expDesc = expDesc;
        this.splitType = splitType;
        this.paidBy = paidBy;
    }

    public int getExpId() {
        return expId;
    }

    public void setExpId(int expId) {
        this.expId = expId;
    }

    public String getExpDesc() {
        return expDesc;
    }

    public void setExpDesc(String expDesc) {
        this.expDesc = expDesc;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public void setSplitType(SplitType splitType) {
        this.splitType = splitType;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }

}
