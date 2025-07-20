// Q45: WAP to find out the sum of all the digits of a number
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n = n / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
