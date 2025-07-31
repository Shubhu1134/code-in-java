// Q13. Print the following pattern:
// 1
// 01
// 101
// 0101
// 10101

public class Test {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // If sum of i and j is even, print 1, else 0
                if ((i + j) % 2 == 0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
}
