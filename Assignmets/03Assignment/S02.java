// S02: WAP to print N natural numbers.
import java.util.Scanner;
class Test {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
