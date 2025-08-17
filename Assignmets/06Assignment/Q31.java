import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("Enter size of X: ");
        m = sc.nextInt();
        System.out.print("Enter size of Y: ");
        n = sc.nextInt();

        int[] X = new int[m];
        int[] Y = new int[n];
        int[] Z = new int[m + n];

        System.out.println("Enter elements of X (desc):");
        for (int i = 0; i < m; i++) X[i] = sc.nextInt();

        System.out.println("Enter elements of Y (desc):");
        for (int i = 0; i < n; i++) Y[i] = sc.nextInt();

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (X[i] > Y[j]) Z[k++] = X[i++];
            else Z[k++] = Y[j++];
        }
        while (i < m) Z[k++] = X[i++];
        while (j < n) Z[k++] = Y[j++];

        System.out.println("Merged array:");
        for (i = 0; i < m + n; i++) System.out.print(Z[i] + " ");
    }
}
