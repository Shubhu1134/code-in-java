// Another way to check Prime using count of divisors

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        // for (int i = 1; i <= n; i++)
        while(i<=n) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }

        if (count == 2) {
            System.out.println(n + " is a Prime number.");
        } else {
            System.out.println(n + " is Not a Prime number.");
        }
    }
}
