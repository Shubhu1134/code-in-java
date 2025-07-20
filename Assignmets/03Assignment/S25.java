// Q.25 --> Print 2, 4, 6, 8,...n terms (even numbers)

import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();
        int count = 0, i = 2;
        while (count < n) {
            System.out.println(i);
            i += 2;
            count++;
        }
    }
}
