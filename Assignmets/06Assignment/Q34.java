// Q34. Write a java program to implement linear search
import java.util.Scanner;

class Test  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Linear Search
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break; // jab mil jaaye, loop rok do
            }
        }

        if (!found) {
            System.out.println("Element not found in array.");
        }

        sc.close();
    }
}
