// 16. Convert temperature from Fahrenheit to Celsius and vice versa

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice (C for Fahrenheit to Celsius, F for Celsius to Fahrenheit): ");
        char choice = sc.next().charAt(0);

        if (choice == 'C' || choice == 'c') {
            System.out.print("Enter Fahrenheit: ");
            double f = sc.nextDouble();
            double c = (f - 32) * 5 / 9;
            System.out.println("Celsius: " + c);
        } else if (choice == 'F' || choice == 'f') {
            System.out.print("Enter Celsius: ");
            double c = sc.nextDouble();
            double
