// Q11
// Q11. The base and height of a triangle are in the ratio 8:5 and its area is 320 m². Find the height and base of the triangle.

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        int ratioBase = 8;
        int ratioHeight = 5;
        int area = 320;

        int k = (int) Math.sqrt((2 * area) / (ratioBase * ratioHeight));
        int base = ratioBase * k;
        int height = ratioHeight * k;

        System.out.println("Base: " + base + " m");
        System.out.println("Height: " + height + " m");
    }
}
