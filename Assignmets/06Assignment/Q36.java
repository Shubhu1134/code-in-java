// Q36. Write a java program to implement bubble sort algorithm
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Array input lena
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 2: Bubble Sort lagana
        for (int i = 0; i < n - 1; i++) {  // outer loop -> n-1 passes
            for (int j = 0; j < n - i - 1; j++) { // inner loop -> compare adjacent elements
                if (arr[j] > arr[j + 1]) {  
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Step 3: Sorted array print karna
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
