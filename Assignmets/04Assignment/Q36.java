/*
Q36. Print the following pattern
ABCDE
A  D
A C
AB
A
*/
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // e.g., 5

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                if (i == 1) {
                    System.out.print((char)('A' + j - 1));
                } else if (j == 1) {
                    System.out.print('A');
                } else if (j == n - i + 1) {
                    System.out.print((char)('A' + j - 1));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
