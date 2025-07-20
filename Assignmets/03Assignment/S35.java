// Q.35: Find sum of squares of first n natural numbers
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares = " + sum);
    }
}
