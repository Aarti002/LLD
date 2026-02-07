package BookMyShow.Core;

public class Movie {
    private int movieId;
    private String movieName;
    private int duration;

    public Movie(int id, String name, int length) {
        this.movieId = id;
        this.movieName = name;
        this.duration = length;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
