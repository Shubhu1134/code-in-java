import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, val;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter value to search: ");
        val = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++)
            if (arr[i] == val) {
                found = true;
                break;
            }

        System.out.println(found ? "Element found" : "Element not found");
    }
}
