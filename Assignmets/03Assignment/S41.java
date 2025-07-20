// Q41: WAP to find out LCM of a number
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a, b);

        while(true){
            if(max % a == 0 && max % b == 0){
                System.out.println("LCM is: " + max);
                break;
            }
            max++;
        }
    }
}
