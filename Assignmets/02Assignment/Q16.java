/* 16. Convert Fahrenheit to Celsius or vice versa using user choice.
*/

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter choice (C/F): ");
        char ch = sc.next().charAt(0);

        if(ch == 'C' || ch == 'c') {
            System.out.print("Enter temperature in Fahrenheit: ");
            float f = sc.nextFloat();
            float c = (f - 32) * 5 / 9;
            System.out.println("Celsius = " + c);
        } else if(ch == 'F' || ch == 'f') {
            System.out.print("Enter temperature in Celsius: ");
            float c = sc.nextFloat();
            float f = (c * 9 / 5) + 32;
            System.out.println("Fahrenheit = " + f);
        } else {
            System.out.println("Invalid choice");
        }
    }
}
