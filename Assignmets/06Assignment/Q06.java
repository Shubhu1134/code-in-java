// // Q.5 Find occurrence of an integer number in array.

// import java.util.Scanner;

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

//         System.out.print("Enter the number to find occurrence of: ");
//         int num = sc.nextInt();

//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == num) {
//                 count++;
//             }
//         }

//         System.out.println("Occurrence of " + num + ": " + count + " times");

//         sc.close();
//     }
// }



// Q.6 Sort the array of 0s , 1s and 2s.

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements (only 0, 1, 2):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
