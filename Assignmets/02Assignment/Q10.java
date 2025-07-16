/* 10. Check if year is leap year or not
*/

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }
    }
}
