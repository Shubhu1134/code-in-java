// Q.23 --> Print 1, 4, 7, 10,...n terms (AP with d=3)

import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a += 3;
        }
    }
}
