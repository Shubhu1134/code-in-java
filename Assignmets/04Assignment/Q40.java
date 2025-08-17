/*
Q40. Print the following pyramid pattern
*
**
****
*******
***********
*/
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of rows

        int stars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            stars = stars * 2 - 1; // grows like 1,2,4,7,11...
        }

        sc.close();
    }
}
