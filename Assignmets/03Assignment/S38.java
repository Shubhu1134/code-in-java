// Q.38: Find HCF of two numbers
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = 1;
        for(int i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF = " + hcf);
    }
}
