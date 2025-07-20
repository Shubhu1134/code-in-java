// Q.21 --> Print 1 4 9 16...n terms (squares of natural numbers)

import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i * i);
        }
    }
}
