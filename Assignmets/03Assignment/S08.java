// Q.8 -- WAP to print Fibonacci series.
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of terms ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        int i = 1;

        while (i <= n) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
            i++;
        }
    }
}
