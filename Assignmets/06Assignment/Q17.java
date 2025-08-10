// Q.17 Check if any subarray has sum 0

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        System.out.println(found ? "Yes" : "No");
    }
}
