// Q.16 Rearrange array in alternating positive and negative items

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int[] pos = new int[n];
        int[] neg = new int[n];
        int p = 0, ne = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] >= 0) pos[p++] = arr[i];
            else neg[ne++] = arr[i];
        }

        int i = 0, j = 0, k = 0;
        while (i < p && j < ne) {
