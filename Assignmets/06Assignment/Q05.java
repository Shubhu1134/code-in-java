// // Q.5 Find the kth largest and kth smallest element in array.

// import java.util.Scanner;
// import java.util.Arrays;

// public class Test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter value of k: ");
//         int k = sc.nextInt();

//         Arrays.sort(arr); // Sorting the array

//         if (k > 0 && k <= n) {
//             System.out.println(k + "th smallest element: " + arr[k - 1]);
//             System.out.println(k + "th largest element: " + arr[n - k]);
//         } else {
//             System.out.println("Invalid value of k.");
//         }

//         sc.close();
//     }
// }



import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take array size
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Step 2: Take array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Take value of k
        int k = sc.nextInt();

        // Step 4: Sort array manually using Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Step 5: kth smallest is at index k-1 (0-based index)
        int kthSmallest = arr[k - 1];
        // kth largest is at index n-k
        int kthLargest = arr[n - k];

        // Step 6: Print results
        System.out.println("Kth Smallest: " + kthSmallest);
        System.out.println("Kth Largest: " + kthLargest);
    }
}
