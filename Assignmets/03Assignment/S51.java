// 51) WAP to reverse all the numbers between two entered numbers

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end;
        System.out.print("Enter start number: ");
        start = sc.nextInt();
        System.out.print("Enter end number: ");
        end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int num = i, rev = 0;
            while (num != 0) {
                rev = rev * 10 + num % 10;
                num /= 10;
            }
            System.out.println("Reverse of " + i + " is " + rev);
        }
    }
}
