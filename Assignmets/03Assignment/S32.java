// Q.32: Find the sum of odd numbers between 1 and n
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("Sum of odd numbers = " + sum);
    }
}
