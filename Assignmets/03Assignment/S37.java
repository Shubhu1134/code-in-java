// 37) WAP to check whether entered number is palindrome or not

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        int temp = num, rev = 0;
        while (num != 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num = num / 10;
        }
        if (rev == temp)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome");
    }
}
