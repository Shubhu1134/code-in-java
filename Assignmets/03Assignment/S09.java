// Q.9 -- WAP to print N even numbers.
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N ");
        int n = sc.nextInt();
        int i = 1;
        int count = 0;

        while (count < n) {
            System.out.println(i * 2);
            i++;
            count++;
        }
    }
}
