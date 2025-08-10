// Q.12 Find common elements in three sorted arrays without using extra DS

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sizes and arrays
        int n1 = sc.nextInt();
        int[] A = new int[n1];
        for (int i = 0; i < n1; i++) A[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] B = new int[n2];
        for (int i = 0; i < n2; i++) B[i] = sc.nextInt();

        int n3 = sc.nextInt();
        int[] C = new int[n3];
        for (int i = 0; i < n3; i++) C[i] = sc.nextInt();

        int i = 0, j = 0, k = 0;

        System.out.print("Common elements: ");
        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k]) {
                // Skip duplicates
                if (i == 0 || A[i] != A[i - 1])
                    System.out.print(A[i] + " ");
                i++; j++; k++;
            } else if (A[i] < B[j]) i++;
            else if (B[j] < C[k]) j++;
            else k++;
        }

        sc.close();
    }
}
