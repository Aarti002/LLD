package BookMyShow.Controllers;

import BookMyShow.Core.Seat;
import BookMyShow.Core.Show;

import java.util.List;

public class ShowController {
    List<Show> allShows;

    public ShowController(List<Show> shows) {
        this.allShows = shows;
    }

    public void addNewShow(Show show) {
        allShows.add(show);
    }

    public boolean cancelShow(Show show) {
        if(!allShows.contains(show)) {
            return false;
        }
        allShows.remove(show);
        return true;
    }

    public List<Seat> getAvailableSeats(Show show) {
        if(!allShows.contains(show)) {
            return null;
        }
        return show.getBookedSeats();
    }
}
