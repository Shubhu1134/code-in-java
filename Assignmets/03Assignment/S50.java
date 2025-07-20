// Q50: Print first n Fibonacci numbers.
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Fibonacci numbers to print: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
