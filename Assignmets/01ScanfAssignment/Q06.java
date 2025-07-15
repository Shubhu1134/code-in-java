// Q06. Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter is 36 cm.

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        int a = 10;
        int b = 9;
        int perimeter = 36;
        int c = perimeter - (a + b);

        double s = perimeter / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Third side: " + c + " cm");
        System.out.println("Area: " + area + " cm^2");
    }
}
