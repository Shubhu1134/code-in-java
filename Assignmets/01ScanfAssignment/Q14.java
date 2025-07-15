// Q14
// Q14. Diagonal = 46 m, heights from other vertices = 13 m and 10 m. Find area of quadrilateral.

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        int diagonal = 46;
        int h1 = 13;
        int h2 = 10;

        double area = 0.5 * diagonal * (h1 + h2);

        System.out.println("Area of field: " + area + " m^2");
    }
}
