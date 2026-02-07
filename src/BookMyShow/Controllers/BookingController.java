package BookMyShow.Controllers;

import BookMyShow.Core.Screen;
import BookMyShow.Core.Seat;
import BookMyShow.Core.Show;

import java.util.ArrayList;
import java.util.List;

public class BookingController {

    public void makeReservation(Show show, List<Seat> selectedSeats) {
        synchronized (show) {
            Screen showAudi = show.getScreen();
            List<Seat> allSeats = showAudi.getSeats();
            List<Seat> bookedSeats = show.getBookedSeats();
            List<Seat> seatConfirmationInProgress = new ArrayList<>();
            for (Seat s : selectedSeats) {
                if (!allSeats.contains(s)) {
                    System.out.println("Oops... wrong seat/s selected.");
                    break;
                }
                if (bookedSeats.contains(s)) {
                    System.out.println("Looks like somebody already booked seat " + s.getSeatNo());
                } else {
                    seatConfirmationInProgress.add(s);
                    s.setOccupied(true);
                    show.setBookedSeats(s);
                    System.out.println("Seat booked: " + s.getSeatNo());
                }


            }
        }

    }

}
