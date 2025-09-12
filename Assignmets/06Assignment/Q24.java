import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // Swap
        int temp = arr[0];
        arr[0] = arr[n - 1];
        arr[n - 1] = temp;

        System.out.println("Array after swap:");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}
