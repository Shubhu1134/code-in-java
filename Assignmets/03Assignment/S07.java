// Q.7 -- WAP to check whether entered number is prime or not.
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        int i = 2;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            while (i <= n / 2) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime number");
        } else {
            System.out.println(n + " is not a Prime number");
        }
    }
}
