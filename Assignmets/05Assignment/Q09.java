// 9. WAP to delete element from array at specific position
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();
        for(int i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];
        n--;
        System.out.println("Array after deletion:");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
