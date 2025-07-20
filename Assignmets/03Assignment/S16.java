// Q.16: Print odd numbers in reverse from n to 1
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit:");
        int n = sc.nextInt();
        while (n >= 1) {
            if (n % 2 != 0) {
                System.out.println(n);
            }
            n--;
        }
    }
}
