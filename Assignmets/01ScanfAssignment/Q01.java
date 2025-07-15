// Q01. The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area.

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        int perimeter = 230;
        int length = 70;

        int breadth = (perimeter / 2) - length;
        int area = length * breadth;

        System.out.println("Breadth: " + breadth + " cm");
        System.out.println("Area: " + area + " cm^2");
    }
}
