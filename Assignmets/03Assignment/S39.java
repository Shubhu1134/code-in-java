// Q.39: Count digits in a number
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int count = 0;
        while(n != 0) {
            count++;
            n = n / 10;
        }
        System.out.println("Total digits = " + count);
    }
}
