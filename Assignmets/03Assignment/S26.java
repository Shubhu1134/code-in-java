// Q26: 0, 8, 64, 216 … (even numbers cubed)
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int count = 0, i = 0;
        while(count < n) {
            if(i % 2 == 0) {
                System.out.print((i * i * i) + " ");
                count++;
            }
            i++;
        }
    }
}
