// Q06. Print the following pattern:
// 11111
// 22222
// 33333
// 44444
// 55555

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {         // Rows
            for (int j = 1; j <= 5; j++) {     // Columns
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
