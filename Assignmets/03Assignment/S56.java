// 56) WAP to print factorial of all the numbers between two entered numbers

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
            int fact = 1;
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }
            System.out.println("Factorial of " + i + " is " + fact);
        }
    }
}
