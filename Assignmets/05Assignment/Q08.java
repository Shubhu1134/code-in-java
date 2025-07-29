// 8. WAP to insert an element at a specific position
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
        System.out.print("Enter position to insert: ");
        int pos = sc.nextInt();
        System.out.print("Enter value: ");
        int val = sc.nextInt();
        for(int i = n; i > pos; i--)
            arr[i] = arr[i-1];
        arr[pos] = val;
        n++;
        System.out.println("Array after insertion:");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
