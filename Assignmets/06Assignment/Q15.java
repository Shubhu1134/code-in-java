// Q.15 Count subarrays with equal 0s and 1s

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // Convert 0 to -1
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arr[i] = (val == 0) ? -1 : 1;
        }

        int count = 0;

        // Brute-force: Check all subarrays with sum 0
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    count++;
                }
            }
        }

        System.out.println("Total subarrays with equal 0s and 1s: " + count);
        sc.close();
    }
}
