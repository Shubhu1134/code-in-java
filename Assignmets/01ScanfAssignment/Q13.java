// Q13
// Q13. The area of a right triangle is 184 cm² and one leg is 16 cm long. Find the length of the other leg.

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        int area = 184;
        int leg1 = 16;

        double leg2 = (2.0 * area) / leg1;

        System.out.println("Other leg: " + leg2 + " cm");
    }
}
