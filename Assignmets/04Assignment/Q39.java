/*
Q39. Print the following pattern
123456
54321
1234
321
12
1
*/
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // e.g., 6

        int len = n;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) { 
                // odd row: increasing
                for (int j = 1; j <= len; j++) {
                    System.out.print(j);
                }
            } else {
                // even row: decreasing
                for (int j = len; j >= 1; j--) {
                    System.out.print(j);
                }
            }
            System.out.println();
            len--;
        }

        sc.close();
    }
}
