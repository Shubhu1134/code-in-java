// Q29: 1, 11, 111, 1111 …
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int num = 1;
        for(int i = 1; i <= n; i++) {
            System.out.print(num + " ");
            num = num * 10 + 1;
        }
    }
}
