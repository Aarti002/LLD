package BookMyShow.Enums;

public enum SeatType {
    Platinum(100),
    Silver(150),
    Gold(200);
    public final int val;

    SeatType(int val) {
        this.val = val;
    }
}
