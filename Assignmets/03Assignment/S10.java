// Q.10 -- WAP to print Even numbers upto N.
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N ");
        int n = sc.nextInt();
        int i = 2;

        while (i <= n) {
            System.out.println(i);
            i += 2;
        }
    }
}
