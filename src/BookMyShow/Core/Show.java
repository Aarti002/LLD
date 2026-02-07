package BookMyShow.Core;

import java.util.ArrayList;
import java.util.List;

public class Show {
    private int showId;
    private Movie movie;
    private List<Seat> bookedSeats;
    private int startTime;
    private Screen screen;

    public Show(int id, Movie movie, int time, Screen screen) {
        this.showId = id;
        this.movie = movie;
        this.startTime = time;
        this.screen = screen;
        this.bookedSeats = new ArrayList<>();
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<Seat> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(Seat bookedSeat) {
        this.bookedSeats.add(bookedSeat);
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
