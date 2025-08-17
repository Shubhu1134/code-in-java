/*
Q42. Print the following inverted number pattern
54321
5432
543
54
5
*/
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // e.g., 5

        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= n - i + 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
