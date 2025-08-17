// Q37. Write a java program to implement insertion sort algorithm
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Array size input
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Step 2: Array elements input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Insertion Sort Algorithm
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // current element
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // shift right
                j = j - 1;
            }

            // Place key at correct position
            arr[j + 1] = key;
        }

        // Step 4: Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
