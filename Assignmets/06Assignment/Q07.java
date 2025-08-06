// Q.7 Sub array with given sum
// Given an unsorted array A of size N that contains only non-negative integers, 
// find a continuous sub-array which adds to a given number S.

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input N and S
        System.out.print("Enter the size of array (N): ");
        int n = sc.nextInt();
        System.out.print("Enter the target sum (S): ");
        int s = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements (non-negative integers):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0, end = 0, sum = 0;
        boolean found = false;

        // Sliding window logic
        while (end <= n) {
            if (sum < s && end < n) {
                sum += arr[end];
                end++;
            } else if (sum > s) {
                sum -= arr[start];
                start++;
            } else if (sum == s) {
                System.out.println("Output: " + (start + 1) + " " + end); // 1-based indexing
                found = true;
                break;
            } else {
                break;
            }
        }

        if (!found) {
            System.out.println("No subarray found");
        }

        sc.close();
    }
}
