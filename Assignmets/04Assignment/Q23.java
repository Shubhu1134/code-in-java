// Hollow alphabet right-angled triangle
// Row i: print letters starting with 'A'; borders shown, last row full.
// Works best for n <= 26.
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // e.g., 5

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == n) {
                    // last row: A B C ... (no spaces)
                    System.out.print((char)('A' + j - 1));
                } else if (j == 1) {
                    // first column always 'A'
                    System.out.print('A');
                } else if (j == i) {
                    // diagonal uses the row letter
                    System.out.print((char)('A' + i - 1));
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
