/*
Q34. Print the following pattern
EEEEE
DDDD
CCC
BB
A
*/
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // e.g., 5
        for (int i = n; i >= 1; i--) {
            char ch = (char)('A' + i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        sc.close();
    }
}
