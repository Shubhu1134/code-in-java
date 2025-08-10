// 19. Write a Java program to create a class
// with methods to search for flights and hotels,
// and to book and cancel reservations.

import java.util.ArrayList;

class TravelBooking {
    private ArrayList<String> flights = new ArrayList<>();
    private ArrayList<String> hotels = new ArrayList<>();
    private ArrayList<String> bookings = new ArrayList<>();

    public void searchFlights() {
        flights.add("Flight 101 - New York");
        flights.add("Flight 202 - London");
        System.out.println("Flights available: " + flights);
    }
    public void searchHotels() {
        hotels.add("Hotel Sunshine");
        hotels.add("Hotel Paradise");
        System.out.println("Hotels available: " + hotels);
    }
    public void book(String item) {
        bookings.add(item);
        System.out.println(item + " booked.");
    }
    public void cancel(String item) {
        if (bookings.remove(item)) {
            System.out.println(item + " booking cancelled.");
        } else {
            System.out.println(item + " not found in bookings.");
        }
    }
    public void displayBookings() {
        System.out.println("Bookings: " + bookings);
    }
}

class TestMain {
    public static void main(String args[]) {
        TravelBooking tb = new TravelBooking();
        tb.searchFlights();
        tb.searchHotels();
        tb.book("Flight 101 - New York");
        tb.book("Hotel Sunshine");
        tb.displayBookings();
        tb.cancel("Flight 101 - New York");
        tb.displayBookings();
    }
}
