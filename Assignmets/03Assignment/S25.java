// Q25: 1, 27, 125, 343 … (odd numbers cubed)
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int count = 0, i = 1;
        while(count < n) {
            if(i % 2 != 0) {
                System.out.print((i * i * i) + " ");
                count++;
            }
            i++;
        }
    }
}
