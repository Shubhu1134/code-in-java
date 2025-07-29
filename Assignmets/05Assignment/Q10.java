// 10. WAP to count the occurrence of all elements in array
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] counted = new boolean[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Element : Count");
        for(int i = 0; i < n; i++) {
            if(!counted[i]) {
                int count = 1;
                for(int j = i+1; j < n; j++) {
                    if(arr[i] == arr[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println(arr[i] + " : " + count);
            }
        }
    }
}
