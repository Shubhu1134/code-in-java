// 38) WAP to check whether entered number is Armstrong or not

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        int temp = num, sum = 0;
        while (num != 0) {
            int d = num % 10;
            sum += d * d * d;
            num = num / 10;
        }
        if (sum == temp)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong");
    }
}
