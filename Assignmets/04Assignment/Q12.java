// Q12. Print the following pattern:
// a
// ab
// abc
// abcd
// abcde

public class Test {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'e'; i++) {
            for (char j = 'a'; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
