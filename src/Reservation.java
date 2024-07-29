import java.util.Date;

public class Reservation {
    private String reservationId;
    private Passenger passenger;
    private Flight flight;
    private Seat seat;
    private Date reservationDate;

    public Reservation(Passenger passenger, Flight flight, Seat seat) {
        this.reservationId = generateReservationId();
        this.passenger = passenger;
        this.flight = flight;
        this.seat = seat;
        this.reservationDate = new Date();
        seat.setAvailability(false);
    }

    private String generateReservationId() {
        // Generate a random reservation ID
        return "RES" + System.currentTimeMillis();
    }

    // Getters and setters
    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
}
