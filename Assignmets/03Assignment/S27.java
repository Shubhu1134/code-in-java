// Q.27 --> Print sum of n even numbers

import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of even numbers: ");
        int n = sc.nextInt();
        int sum = 0, count = 0, i = 2;
        while (count < n) {
            sum += i;
            i += 2;
            count++;
        }
        System.out.println("Sum of even numbers = " + sum);
    }
}
