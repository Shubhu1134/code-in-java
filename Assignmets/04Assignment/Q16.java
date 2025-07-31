// Q16. Print the following pattern:
// a
// bc
// def
// ghij
// klmno

public class Test {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'a';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
