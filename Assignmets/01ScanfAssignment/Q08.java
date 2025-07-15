// Q08. Find the base of a triangle whose altitude is 20 cm and area is 0.8 m².

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        double area = 0.8 * 10000; // convert to cm²
        double height = 20;

        double base = (2 * area) / height;

        System.out.println("Base: " + base + " cm");
    }
}
