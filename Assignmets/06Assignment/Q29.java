import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, val;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter sorted array:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter value to search: ");
        val = sc.nextInt();

        int low = 0, high = n - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == val) {
                found = true;
                break;
            } else if (arr[mid] < val) low = mid + 1;
            else high = mid - 1;
        }

        System.out.println(found ? "Element found" : "Element not found");
    }
}
