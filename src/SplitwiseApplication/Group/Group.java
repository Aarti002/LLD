package SplitwiseApplication.Group;

import SplitwiseApplication.Expense.Expense;
import SplitwiseApplication.User.User;

import java.util.List;

public class Group {
    private int grpId;
    private String desc;
    private List<User> members;
    private List<Expense> expenses;

    public int getGrpId() {
        return grpId;
    }

    public void setGrpId(int grpId) {
        this.grpId = grpId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members.addAll(members);
    }

    public void setNewMember(User member) {
        this.members.add(member);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }
}
