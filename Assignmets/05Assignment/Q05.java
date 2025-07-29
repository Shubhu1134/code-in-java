// 5. WAP to replace all elements with 0 which are multiples of 5
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for(int i = 0; i < n; i++) {
            if(arr[i] % 5 == 0)
                arr[i] = 0;
        }
        System.out.println("Modified array:");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
