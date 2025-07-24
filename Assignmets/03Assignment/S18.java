// 18) 1 2 2 4 8 32 …… n terms

import java.util.Scanner;
 class Test {
    public static void main(String args []) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // user input for number of terms

        int count = 1;
        long a = 1, b = 2, c = 2;

        if (n >= 1) {
            System.out.print(a + " ");
            count++;
        }

        if (n >= 2) {
            System.out.print(b + " ");
            count++;
        }

        if (n >= 3) {
            System.out.print(c + " ");
            count++;
        }

        while (count <= n) {
            long next = b * c;
            System.out.print(next + " ");
            b = c;
            c = next;
            count++;
        }

        scanner.close();
    }
}
