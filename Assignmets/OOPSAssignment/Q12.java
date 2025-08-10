// 12. Write a Java program to create a class called "Airplane"
// with a flight number, destination, and departure time attributes,
// and methods to check flight status and delay.

class Airplane {
    private String flightNumber;
    private String destination;
    private String departureTime;
    private boolean delayed;

    public Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayed = false;
    }
    public Airplane() {}

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    public void checkStatus() {
        if (delayed) {
            System.out.println("Flight " + flightNumber + " is delayed.");
        } else {
            System.out.println("Flight " + flightNumber + " is on time.");
        }
    }

    public void display() {
        System.out.println("Flight: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
        checkStatus();
    }
}

class TestMain {
    public static void main(String args[]) {
        Airplane a1 = new Airplane("AI101", "New York", "10:00 AM");
        a1.display();
        a1.setDelayed(true);
        a1.display();
    }
}
