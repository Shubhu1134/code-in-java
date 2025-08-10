// Q.9 Find the Union and Intersection of two sorted arrays (No libraries except Scanner)

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sizes
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int i = 0, j = 0;
        int[] union = new int[n + m];
        int[] inter = new int[Math.min(n, m)];
        int u = 0, in = 0;

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                if (u == 0 || union[u - 1] != a[i]) {
                    union[u++] = a[i];
                }
                i++;
            }
