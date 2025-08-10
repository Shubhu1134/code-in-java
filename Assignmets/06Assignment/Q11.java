// Q.11 Count pairs with given sum

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array and target sum
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter target sum (K): ");
        int k = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int count = 0;

        // Check all pairs (i, j) such that i < j
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    count++;
                }
            }
        }

        System.out.println("Number of pairs: " + count);
        sc.close();
    }
}
