// 12) WAP to print Odd numbers upto N.

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
