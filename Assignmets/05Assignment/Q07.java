// 7. WAP to search an element using binary search
import java.util.Scanner;
import java.util.Arrays;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted elements:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();
        int index = Arrays.binarySearch(arr, key);
        if(index >= 0)
            System.out.println("Found at index " + index);
        else
            System.out.println("Not found");
    }
}
