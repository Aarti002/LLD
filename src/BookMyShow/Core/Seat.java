package BookMyShow.Core;

import BookMyShow.Enums.SeatType;

public class Seat {
    private int seatNo;
    private int amount;
    private boolean isOccupied;
    private SeatType type;

    public Seat(int no, SeatType type) {
        this.seatNo = no;
        this.type = type;
        this.isOccupied = false;
        this.amount = this.type.val + 50;
    }

    public int getAmount() {
        return amount;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public SeatType getType() {
        return type;
    }

    public void setType(SeatType type) {
        this.type = type;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
