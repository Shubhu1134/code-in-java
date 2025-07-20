// Q.55: Find factorial of a number
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        System.out.println("Factorial: " + fact);
    }
}
