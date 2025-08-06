// Q.5 Find the kth largest and kth smallest element in array.

import java.util.Scanner;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        Arrays.sort(arr); // Sorting the array

        if (k > 0 && k <= n) {
            System.out.println(k + "th smallest element: " + arr[k - 1]);
            System.out.println(k + "th largest element: " + arr[n - k]);
        } else {
            System.out.println("Invalid value of k.");
        }

        sc.close();
    }
}
