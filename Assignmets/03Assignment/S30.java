// Q.30 --> Check if number is palindrome

import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int original = n, reverse = 0;
        while (n > 0) {
            int d = n % 10;
            reverse = reverse * 10 + d;
            n = n / 10;
        }
        if (original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
