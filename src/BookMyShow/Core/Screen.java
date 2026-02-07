package BookMyShow.Core;

import BookMyShow.Enums.ScreenType;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    private int screenId;
    private List<Seat> seats;
    private ScreenType screenType;

    public Screen(int id, ScreenType type) {
        this.screenId = id;
        this.screenType = type;
        this.seats = new ArrayList<>();
    }

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(Seat seats) {
        this.seats.add(seats);
    }

    public ScreenType getScreenType() {
        return screenType;
    }

    public void setScreenType(ScreenType screenType) {
        this.screenType = screenType;
    }
}
