// Q07. Print the following pattern:
// 1
// 00
// 111
// 0000
// 11111

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int value = (i % 2 == 0) ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
