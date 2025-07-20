// Q.6 -- WAP to find out the factors of a number.
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {
            if (n % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
