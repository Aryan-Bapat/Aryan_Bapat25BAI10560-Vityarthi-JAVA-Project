import java.util.ArrayList;

public class SeatingArrangement {

    private ArrayList<Seat> seats;

    public SeatingArrangement() {
        seats = new ArrayList<>();
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void displayArrangement() {

        System.out.println("\n===== SEATING ARRANGEMENT =====");

        if (seats.isEmpty()) {
            System.out.println("No seating arrangement available.");
            return;
        }

        for (Seat seat : seats) {
            seat.displaySeat();
        }
    }
}