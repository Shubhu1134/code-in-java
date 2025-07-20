// Q.24 --> Print 1, 3, 5, 7,...n terms (odd numbers)

import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();
        int count = 0, i = 1;
        while (count < n) {
            System.out.println(i);
            i += 2;
            count++;
        }
    }
}
