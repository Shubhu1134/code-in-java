// Q30: 1+11+111+1111+... up to N terms
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int num = 1;
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += num;
            num = num * 10 + 1;
        }
        System.out.println("Sum is: " + sum);
    }
}
