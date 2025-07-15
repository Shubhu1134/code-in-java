// Q07. Find the height of a triangle whose base is 50 cm and whose area is 500 cm².

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        int base = 50;
        int area = 500;

        double height = (2.0 * area) / base;

        System.out.println("Height: " + height + " cm");
    }
}
