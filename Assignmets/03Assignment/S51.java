// Q.51: Print first n natural numbers in reverse order
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        while (n >= 1) {
            System.out.println(n);
            n--;
        }
    }
}
