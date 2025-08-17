/*
Q41. Print the following pattern
A
BCD
EFGHI
JKLMNOP
*/
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(); // e.g., 4
        char ch = 'A';

        for (int i = 1; i <= rows; i++) {
            int count = (2 * i - 1); // row length
            for (int j = 1; j <= count; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        sc.close();
    }
}
