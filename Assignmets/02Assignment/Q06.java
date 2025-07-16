/* 6. Print absolute value of number entered by user.
*/

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if(num < 0) {
            num = -num;
        }

        System.out.println("Absolute value is: " + num);
    }
}
