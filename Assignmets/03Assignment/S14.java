// Q.14: Print reverse of 1 to n
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit:");
        int n = sc.nextInt();
        while (n >= 1) {
            System.out.println(n);
            n--;
        }
    }
}
