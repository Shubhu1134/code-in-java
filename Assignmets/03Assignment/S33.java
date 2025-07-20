// Q.33: Display all odd numbers between two numbers a and b
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start and end:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = a; i <= b; i++) {
            if(i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}
