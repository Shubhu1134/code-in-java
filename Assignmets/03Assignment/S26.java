// Q.26 --> Print sum of n odd numbers

import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of odd numbers: ");
        int n = sc.nextInt();
        int sum = 0, count = 0, i = 1;
        while (count < n) {
            sum += i;
            i += 2;
            count++;
        }
        System.out.println("Sum of odd numbers = " + sum);
    }
}
