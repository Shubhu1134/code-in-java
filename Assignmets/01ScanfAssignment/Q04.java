// Q04. Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m.

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        int length = 300;
        int breadth = 150;
        int area = length * breadth;

        double cost = (area / 100.0) * 6;

        System.out.println("Total cost: $" + cost);
    }
}
