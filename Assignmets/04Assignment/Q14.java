// Q14. Print the following pattern:
// 1
// 23
// 456
// 78910

public class Test {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;

        for (int i = 1; i <= n; i++) { // Rows
            for (int j = 1; j <= i; j++) { // Columns
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
