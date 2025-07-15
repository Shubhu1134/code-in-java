// Q09. Find the area of an equilateral triangle, the length of whose sides is 12 cm.

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        int side = 12;

        double area = (Math.sqrt(3) / 4) * side * side;

        System.out.println("Area: " + area + " cm^2");
    }
}
