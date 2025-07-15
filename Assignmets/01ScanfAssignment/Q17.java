// Q17. Display board 3m × 2m. Find ribbon needed around it.

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        int length = 3;
        int breadth = 2;

        int perimeter = 2 * (length + breadth);

        System.out.println("Ribbon needed: " + perimeter + " m");
    }
}
