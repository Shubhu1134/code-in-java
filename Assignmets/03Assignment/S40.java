// 40) WAP to count no. of even and odd digits in a number

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int even = 0, odd = 0;
        while (num != 0) {
            int d = num % 10;
            if (d % 2 == 0) even++;
            else odd++;
            num = num / 10;
        }
        System.out.println("Even digits: " + even);
        System.out.println("Odd digits: " + odd);
    }
}
