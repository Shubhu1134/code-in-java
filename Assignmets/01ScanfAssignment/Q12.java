// Q12
// Q12. Find the area of a right-angled triangle whose hypotenuse is 13 cm and one side is 12 cm. Find the other side.

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        int hypotenuse = 13;
        int side1 = 12;

        int side2 = (int)Math.sqrt(hypotenuse * hypotenuse - side1 * side1);
        double area = 0.5 * side1 * side2;

        System.out.println("Other side: " + side2 + " cm");
        System.out.println("Area: " + area + " cm^2");
    }
}
