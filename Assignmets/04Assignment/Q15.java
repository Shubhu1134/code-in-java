// Q15. Print the following pattern:
// A
// BB
// CCC
// DDDD
// EEEEE

public class Test {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
            ch++; // move to next character
        }
    }
}
