// Q.57: Print all factors of a number
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            if (n % i == 0)
                System.out.println(i);
            i++;
        }
    }
}
