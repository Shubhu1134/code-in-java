// Q.14 Find first non-repeating element

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int result = 0;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            boolean repeat = false;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    repeat = true;
                    break;
                }
            }
            if (!repeat) {
                result = arr[i];
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("First non-repeating element: " + result);
        else
            System.out.println("Output: 0");

        sc.close();
    }
}
