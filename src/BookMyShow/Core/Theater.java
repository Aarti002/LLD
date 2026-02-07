package BookMyShow.Core;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private int theaterId;
    private Location location;
    private List<Screen> screens;

    public Theater(int id, Location loc) {
        this.theaterId = id;
        this.location = loc;
        this.screens = new ArrayList<>();
    }

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(Screen screens) {
        this.screens.add(screens);
    }
}
