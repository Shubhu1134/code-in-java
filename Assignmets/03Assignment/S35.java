// 35) WAP to count number of digits

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Total digits: " + count);
    }
}
