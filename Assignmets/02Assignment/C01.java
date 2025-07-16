// 1. WAP to calculate area of circle 

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double area = 3.1416 * r * r;
        System.out.println("Area of circle: " + area);
    }
}
