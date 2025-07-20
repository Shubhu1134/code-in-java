// 52) WAP to find out all the Armstrong numbers between two entered numbers

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
            int num = i, temp = i, sum = 0;
            int digits = String.valueOf(num).length();
            while (temp != 0) {
                int r = temp % 10;
                sum += Math.pow(r, digits);
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num + " is an Armstrong number");
            }
        }
    }
}
