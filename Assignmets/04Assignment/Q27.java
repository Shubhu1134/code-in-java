// Hollow 1-0 triangle
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // e.g., 5
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == n) {
                    System.out.print((j % 2 == 1) ? "1" : "0");
                } else if (j == 1) {
                    System.out.print("1");
                } else if (j == i) {
                    System.out.print((i % 2 == 1) ? "1" : "0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
