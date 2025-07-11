/* 18. Ron jogs around a rectangular park of length 50 m and breadth 30 m.
    If he takes 10 rounds of the park each day,
    how much distance does he cover in a day in kilometers?
 */ 

// Calculate the total jogging distance Ron covers in a day after 10 rounds around a rectangular park
class Test {
    public static void main(String[] args) {
        int length = 50;     // in meters
        int breadth = 30;    // in meters
        int rounds = 10;

        // Perimeter of the park
        int perimeter = 2 * (length + breadth); 

        // Total distance in meters
        int totalDistanceMeters = perimeter * rounds;

        // Convert to kilometers
        int totalDistanceKm = totalDistanceMeters / 1000;

        System.out.println("Perimeter of park: " + perimeter + " m");
        System.out.println("Total distance in meters: " + totalDistanceMeters + " m");
        System.out.println("Total distance in kilometers: " + totalDistanceKm + " km");
    }
}
