package BookMyShow;

import BookMyShow.Controllers.BookingController;
import BookMyShow.Controllers.MovieController;
import BookMyShow.Controllers.TheaterController;
import BookMyShow.Core.*;
import BookMyShow.Enums.ScreenType;
import BookMyShow.Enums.SeatType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookMyShow implements Runnable{

    private BookingController bookingController;
    private Show show;
    private List<Seat> seats;

    public BookMyShow(BookingController bookingController, Show show, List<Seat> seats) {
        this.bookingController = bookingController;
        this.show = show;
        this.seats = seats;
    }

    @Override
    public void run() {
        System.out.println("Thread running with Runnable: " + Thread.currentThread().getName());
        bookingController.makeReservation(show, seats);
    }
    public static void main(String[] args) {
        Location patna = new Location(1, "Patna", 10.09, 15.3);
        Location lucknow = new Location(2, "Lucknow", 23.17, 85.93);

        TheaterController theaterController = new TheaterController();
        Theater pvr = new Theater(1, patna);
        Theater cinepolis = new Theater(2, patna);
        Theater nexus = new Theater(3, patna);
        Theater pvr1 = new Theater(1, lucknow);
        theaterController.addTheater(pvr);
        theaterController.addTheater(pvr1);
        theaterController.addTheater(nexus);
        theaterController.addTheater(cinepolis);

        MovieController movieController = new MovieController();
        Movie tereNaam = new Movie(1, "Tere Naam", 150);
        Movie tisMaarKhan = new Movie(2, "Tis Maar Khan", 120);
        movieController.addMovie(patna, tereNaam);
        movieController.addMovie(patna, tisMaarKhan);
        movieController.addMovie(lucknow, tisMaarKhan);

        Screen s1 = new Screen(1, ScreenType.SCREEN_3D);

        Seat seat1 = new Seat(5, SeatType.Platinum);
        Seat seat2 = new Seat(6, SeatType.Silver);
        Seat seat3 = new Seat(7, SeatType.Platinum);
        Seat seat4 = new Seat(8, SeatType.Gold);
        s1.setSeats(seat1);
        s1.setSeats(seat2);
        s1.setSeats(seat4);
        s1.setSeats(seat3);

        pvr.setScreens(s1);

        Show newShow = new Show(1, tereNaam, 2, s1);
        theaterController.addShow(pvr, newShow);


        List<Seat> seats = theaterController.getAllSeats(pvr, s1);
        for(Seat s:seats) {
            System.out.println("Seat type: "+s.getType()+" and price: "+s.getAmount());
        }

        System.out.println("-------------------------------------------");

        List<Show> shows = theaterController.getAllShows(pvr);
        for(Show s:shows) {
            System.out.println("Currently running: "+s.getMovie().getMovieName());
            System.out.println("Booked seats: "+(s.getBookedSeats().size()));
            System.out.println("Watch on: "+s.getScreen().getScreenType());
        }

        System.out.println("-------------------------------------------");


        BookingController booking = new BookingController();

        Show runningShow = theaterController.getAllShows(pvr).getFirst();
        List<Seat> selectedSeat = new ArrayList<>(Arrays.asList(seat1, seat3));
        booking.makeReservation(runningShow, selectedSeat);
//        selectedSeat.add(seat2);
        booking.makeReservation(runningShow, selectedSeat);

        System.out.println("-------------------------------------------");
        for(Show s:shows) {
            System.out.println("Currently running: "+s.getMovie().getMovieName());
            System.out.println("Booked seats: "+(s.getBookedSeats().size()));
            System.out.println("Watch on: "+s.getScreen().getScreenType());
        }

        List<Seat> user1Seats = List.of(seat2);
        List<Seat> user2Seats = List.of(seat2); // SAME SEAT

        Thread user1 = new Thread(
                new BookMyShow(booking, runningShow, user1Seats),
                "User-1"
        );

        Thread user2 = new Thread(
                new BookMyShow(booking, runningShow, user2Seats),
                "User-2"
        );

        user1.start();
        user2.start();





    }
}
