import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("Enter size of A: ");
        m = sc.nextInt();
        System.out.print("Enter size of B: ");
        n = sc.nextInt();

        int[] A = new int[m];
        int[] B = new int[n];
        int[] C = new int[m + n];

        System.out.println("Enter elements of A (ascending):");
        for (int i = 0; i < m; i++) A[i] = sc.nextInt();

        System.out.println("Enter elements of B (descending):");
        for (int i = 0; i < n; i++) B[i] = sc.nextInt();

        // Merge
        int i = 0, j = n - 1, k = 0;
        while (i < m && j >= 0) {
            if (A[i] < B[j]) C[k++] = A[i++];
            else C[k++] = B[j--];
        }
        while (i < m) C[k++] = A[i++];
        while (j >= 0) C[k++] = B[j--];

        System.out.println("Merged array:");
        for (i = 0; i < m + n; i++) System.out.print(C[i] + " ");
    }
}
