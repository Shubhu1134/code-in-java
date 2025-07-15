// Q18. Ron jogs 10 rounds of park (50×30m). Find total distance in km.

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        int length = 50;
        int breadth = 30;

        int oneRound = 2 * (length + breadth);
        int total = oneRound * 10;

        double km = total / 1000.0;

        System.out.println("Total distance: " + km + " km");
    }
}
