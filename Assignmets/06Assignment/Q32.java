import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] A = new int[m];
        for (int i = 0; i < m; i++) A[i] = sc.nextInt();

        int n = sc.nextInt();
        int[] B = new int[n];
        for (int i = 0; i < n; i++) B[i] = sc.nextInt();

        int[] C = new int[m + n];
        int left = 0, right = m + n - 1;

        for (int i = 0; i < m; i++) {
            if (A[i] % 2 == 0) C[left++] = A[i];
        }
        for (int i = 0; i < m; i++) {
            if (A[i] % 2 != 0) C[right--] = A[i];
        }
        for (int i = 0; i < n; i++) {
            if (B[i] % 2 == 0) C[left++] = B[i];
        }
        for (int i = 0; i < n; i++) {
            if (B[i] % 2 != 0) C[right--] = B[i];
        }

        for (int i = 0; i < m + n; i++) System.out.print(C[i] + " ");
    }
}
