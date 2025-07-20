// Q.54: Reverse the digits of a number
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reversed number: " + rev);
    }
}
