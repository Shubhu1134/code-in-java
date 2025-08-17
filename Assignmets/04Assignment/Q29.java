/*
Q29. Print the following pattern
1
222
33333
4444444
555555555
*/
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // e.g., 5
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
