// Q24: 0, 4, 16, 36, 64 … (only even numbers squared)
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();
        for(int i = 2; i <= n; i += 2) {
            System.out.print((i * i) + " ");
        }
    }
}
