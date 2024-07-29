import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create some example flights
        Flight flight1 = new Flight("FL123", "JFK", "LAX", new Date(), new Date());
        Flight flight2 = new Flight("FL456", "SFO", "ORD", new Date(), new Date());

        // Create some seats and add them to the flights
        Seat seat1 = new Seat("1A", "economy", true);
        Seat seat2 = new Seat("1B", "economy", true);
        Seat seat3 = new Seat("1C", "business", true);

        flight1.getSeats().add(seat1);
        flight1.getSeats().add(seat2);
        flight2.getSeats().add(seat3);

        // Create a passenger
        Passenger passenger1 = new Passenger("P123", "Cheperd Yong", "cheperdyong65@example.com", "019-99998888");

        // Create a reservation
        Reservation reservation1 = passenger1.createReservation(flight1, seat1);

        // Display available seats for flight1
        ArrayList<Seat> availableSeats = flight1.findAvailableSeats();
        System.out.println("Available seats for flight " + flight1.getFlightNumber() + ":");
        for (Seat seat : availableSeats) {
            System.out.println("  - Seat: " + seat.getSeatNumber() + " (" + seat.getSeatClass() + ")");
        }
        System.out.println();  // Add a blank line for separation

        // Display reservation details
        System.out.println("Reservation Details:");
        System.out.println("--------------------");
        System.out.println("Reservation ID: " + reservation1.getReservationId());
        System.out.println("Passenger: " + reservation1.getPassenger().getName());
        System.out.println("Email: " + reservation1.getPassenger().getEmail());
        System.out.println("Phone: " + reservation1.getPassenger().getPhoneNumber());
        System.out.println("Flight: " + reservation1.getFlight().getFlightNumber());
        System.out.println("Departure: " + reservation1.getFlight().getDepartureAirport());
        System.out.println("Arrival: " + reservation1.getFlight().getArrivalAirport());
        System.out.println("Seat: " + reservation1.getSeat().getSeatNumber() + " (" + reservation1.getSeat().getSeatClass() + ")");
        System.out.println("Reservation Date: " + reservation1.getReservationDate());
    }
}
