// Q.13 Find first repeating element

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int repeat = -1;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    repeat = arr[i];
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (repeat == -1)
            System.out.println("No repeating element found");
        else
            System.out.println("First repeating element: " + repeat);

        sc.close();
    }
}
