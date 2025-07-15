// Q05. If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs. per m, find the breadth, perimeter, and area.

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        int cost = 1600;
        int rate = 25;
        int length = 20;

        int perimeter = cost / rate;
        int breadth = (perimeter / 2) - length;
        int area = length * breadth;

        System.out.println("Breadth: " + breadth + " m");
        System.out.println("Perimeter: " + perimeter + " m");
        System.out.println("Area: " + area + " m^2");
    }
}

