// 6. WAP to sort the array
import java.util.Scanner;
import java.util.Arrays;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
