// Q.8 Move all negative elements to end of array without changing the order

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the size of array (N): ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create two temporary arrays to store positive and negative numbers
        int[] positive = new int[n];
        int[] negative = new int[n];
        int posIndex = 0, negIndex = 0;

        // Separate positives and negatives
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positive[posIndex++] = arr[i];
            } else {
                negative[negIndex++] = arr[i];
            }
        }

        // Combine positives and negatives back to original array
        int index = 0;
        for (int i = 0; i < posIndex; i++) {
            arr[index++] = positive[i];
        }
        for (int i = 0; i < negIndex; i++) {
            arr[index++] = negative[i];
        }

        // Output final array
        System.out.println("Modified array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
