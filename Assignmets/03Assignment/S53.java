// 53) WAP to print all the strong numbers between two entered numbers

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
            while (temp != 0) {
                int r = temp % 10;
                int fact = 1;
                for (int j = 1; j <= r; j++) {
                    fact *= j;
                }
                sum += fact;
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num + " is a Strong number");
            }
        }
    }
}
