// S03: WAP to find out the sum of N natural numbers.
import java.util.Scanner;
class Test {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
