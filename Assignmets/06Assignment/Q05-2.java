import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size of array
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Step 2: Input array elements (only 0,1,2)
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Count 0s, 1s, 2s
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) count0++;
            else if (arr[i] == 1) count1++;
            else if (arr[i] == 2) count2++;
        }

        // Step 4: Overwrite array
        int index = 0;
        for (int i = 0; i < count0; i++) {
            arr[index++] = 0;
        }
        for (int i = 0; i < count1; i++) {
            arr[index++] = 1;
        }
        for (int i = 0; i < count2; i++) {
            arr[index++] = 2;
        }

        // Step 5: Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
