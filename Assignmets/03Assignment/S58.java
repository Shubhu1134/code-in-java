// 58) WAP to convert decimal number into binary number without using array

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = sc.nextInt();
        int binary = 0, place = 1;

        while (n > 0) {
            int r = n % 2;
            binary += r * place;
            place *= 10;
            n /= 2;
        }

        System.out.println("Binary: " + binary);
    }
}
