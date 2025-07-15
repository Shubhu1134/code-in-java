/* 12. A 4 digit number is entered. Print reverse of it.
*/

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");
        int num = sc.nextInt();

        int rev = 0;

        while(num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number is: " + rev);
    }
}
