// Q42: WAP to find out HCF of a number
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcf = 1;

        for(int i = 1; i <= Math.min(a, b); i++){
            if(a % i == 0 && b % i == 0){
                hcf = i;
            }
        }
        System.out.println("HCF is: " + hcf);
    }
}
