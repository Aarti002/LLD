package SplitwiseApplication.Split;

import SplitwiseApplication.User.User;

public class Split {
    private User user;
    private Double amt;
    private int percent;

    public Split(User user, Double amt, int percent) {
        this.user = user;
        this.amt = amt;
        this.percent = percent;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
