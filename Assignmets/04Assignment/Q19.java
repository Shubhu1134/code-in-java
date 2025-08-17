// Print hollow right-angled triangle pattern
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // e.g., 5

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // print '*' at borders or last row
                if (j == 1 || j == i || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // space for hollow part
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
