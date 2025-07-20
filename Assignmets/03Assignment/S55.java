// 55) WAP to print all the odd numbers between two entered numbers

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
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
