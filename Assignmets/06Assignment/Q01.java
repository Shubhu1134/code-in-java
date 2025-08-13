import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input size of array
        int N = sc.nextInt();
        int arr[] = new int[N];
        
        // Input array elements
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int peakIndex = findPeak(arr, N);
        System.out.println(peakIndex); // Will print index of any peak element
    }
    
    public static int findPeak(int[] arr, int n) {
        // Special case: only one element
        if (n == 1) return 0;
        
        // Check first element
        if (arr[0] >= arr[1]) return 0;
        
        // Check last element
        if (arr[n-1] >= arr[n-2]) return n-1;
        
        // Check middle elements
        for (int i = 1; i < n-1; i++) {
            if (arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) {
                return i;
            }
        }
        return -1; // Should never happen for valid input
    }
}
