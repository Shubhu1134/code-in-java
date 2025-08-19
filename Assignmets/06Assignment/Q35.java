// Q35. Write a java program to implement selection sort algorithm
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // input elements
        System.out.println("Enter " + n + " elements:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // selection sort logic
        for(int i=0; i<n-1; i++) {
            int minIndex = i;   // maan lo pehle element hi sabse chhota hai
            for(int j=i+1; j<n; j++) {
c                if(arr[j] < arr[minIndex]) {
                    minIndex = j; // update smallest element ka index
                }
            }
            // swap current element with smallest element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // print sorted array
        System.out.println("Sorted array:");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
