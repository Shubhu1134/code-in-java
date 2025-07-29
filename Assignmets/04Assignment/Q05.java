// Q05. Print the following pattern:
// 12345
// 12345
// 12345
// 12345
// 12345

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {         // Rows
            for (int j = 1; j <= 5; j++) {     // Columns
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
