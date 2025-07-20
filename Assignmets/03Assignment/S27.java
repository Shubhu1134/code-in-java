// Q27: *, #, *, #, *, # …
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0)
                System.out.print("# ");
            else
                System.out.print("* ");
        }
    }
}
