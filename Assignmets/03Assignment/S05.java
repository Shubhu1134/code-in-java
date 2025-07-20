// Q.5 -- WAP to find out the factorial of a number.
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        int fact = 1;
        int i = 1;

        while (i <= n) {
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial is: " + fact);
    }
}
