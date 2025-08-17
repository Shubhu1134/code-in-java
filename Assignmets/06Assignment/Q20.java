// Q.20 Longest consecutive subsequence

import java.util.Scanner;

public class Test {
    public static boolean exists(int[] arr, int n, int val) {
        for (int i = 0; i < n; i++)
            if (arr[i] == val) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int curr = a[i];
            int count = 1;

            while (exists(a, n, curr + 1)) {
                curr++;
                count++;
            }

            curr = a[i];
            while (exists(a, n, curr - 1)) {
                curr--;
                count++;
            }

            maxLen = Math.max(maxLen, count - 1); // subtract 1 for duplicate middle
        }

        System.out.println(maxLen);
    }
}
