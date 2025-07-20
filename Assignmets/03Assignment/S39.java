// 39) WAP to check whether entered number is strong or not

import java.util.Scanner;
class Test {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        int temp = num, sum = 0;
        while (num != 0) {
            int d = num % 10;
            sum += factorial(d);
            num /= 10;
        }
        if (sum == temp)
            System.out.println("Strong number");
        else
            System.out.println("Not a strong number");
    }
}
