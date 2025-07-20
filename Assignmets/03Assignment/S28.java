// Q28: Print 1 to N, but replace multiples of 5 with Hello
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            if(i % 5 == 0)
                System.out.print("Hello ");
            else
                System.out.print(i + " ");
        }
    }
}
