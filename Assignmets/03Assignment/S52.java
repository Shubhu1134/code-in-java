// Q.52: Print sum of first n odd numbers
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of odd terms:");
        int n = sc.nextInt();
        int i = 1, count = 0, sum = 0;
        while (count < n) {
            sum += i;
            i += 2;
            count++;
        }
        System.out.println("Sum: " + sum);
    }
}
