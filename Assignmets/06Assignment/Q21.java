// Q.21 Max Sum of i*A[i] with rotations

import java.util.Scanner;

public class Test {
    public static int maxSum(int[] arr, int n) {
        int sum = 0, currVal = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            currVal += i * arr[i];
        }

        int max = currVal;

        for (int i = 1; i < n; i++) {
            currVal = currVal + sum - n * arr[n - i];
            if (currVal > max) max = currVal;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();

        System.out.println(maxSum(A, n));
    }
}
