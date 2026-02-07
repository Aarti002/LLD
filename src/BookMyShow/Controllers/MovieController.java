package BookMyShow.Controllers;

import BookMyShow.Core.Location;
import BookMyShow.Core.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    List<Movie> allMovies;
    Map<Location, List<Movie>> movieVsLocations;

    public MovieController() {
        this.allMovies = new ArrayList<>();
        this.movieVsLocations = new HashMap<>();
    }

    public void addMovie(Location location, Movie movie) {
        allMovies.add(movie);
        movieVsLocations.put(location, allMovies);
    }

}
