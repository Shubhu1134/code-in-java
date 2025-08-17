// Mixed star and @ hollow triangle pattern
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // e.g., 5

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == n) {
                    // Last row: all *
                    System.out.print("*");
                } else if (j == 1 || j == i) {
                    // Borders: *
                    System.out.print("*");
                } else {
                    // Inside: @
                    System.out.print("@");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
