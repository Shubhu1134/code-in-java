// 3. WAP to calculate the sum of all even elements and all odd elements of array
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int even = 0, odd = 0;
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0)
                even += arr[i];
            else
                odd += arr[i];
        }
        System.out.println("Sum of even: " + even);
        System.out.println("Sum of odd: " + odd);
    }
}
