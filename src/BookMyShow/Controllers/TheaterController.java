package BookMyShow.Controllers;

import BookMyShow.Core.*;
import BookMyShow.Enums.ScreenType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterController {
    int MAX_SHOW_COUNT = 5;
    List<Theater> allTheaters;
    Map<Theater, List<Show>> theaterVsShow;
    Map<Location, List<Theater>> locVsTheater;

    public TheaterController() {
        this.allTheaters = new ArrayList<>();
        this.theaterVsShow = new HashMap<>();
        this.locVsTheater = new HashMap<>();
    }

    public void addTheater(Theater theater) {
        allTheaters.add(theater);
        locVsTheater.put(theater.getLocation(), allTheaters);
    }

    public void addShow(Theater theater, Show newShow) {
        List<Show> allShows = new ArrayList<>();
        if(getAllShows(theater) != null){
            allShows = getAllShows(theater);
        }
        allShows.add(newShow);

        theaterVsShow.put(theater, allShows);
    }

    public List<Show> getAllShows(Theater theater) {
        if(!theaterVsShow.containsKey(theater)) {
            return null;
        }
        return theaterVsShow.get(theater);
    }

    public List<Theater> getAvailableTheaters(Location loc) {
        List<Theater> currTheater = locVsTheater.get(loc);
        List<Theater> availableTheater = new ArrayList<>();
        for(Theater t:currTheater) {
            if(theaterVsShow.get(t).size() < MAX_SHOW_COUNT) {
                availableTheater.add(t);
            }
        }
        return availableTheater;
    }

    public void addNewScreen(Theater theater) {
        List<Screen> currScreens = theater.getScreens();
        Screen screen = new Screen(currScreens.size()+1, ScreenType.SCREEN_3D);
    }

    public List<Seat> getAllSeats(Theater theater, Screen scrn) {
        if(theater.getScreens() == null || !theater.getScreens().contains(scrn)) {
            System.out.println("Looks like this screen option in not there in given theater...");
        }
        return scrn.getSeats();
    }
}
