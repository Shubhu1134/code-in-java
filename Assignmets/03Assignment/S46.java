// Q46: WAP to find out the sum of first and last digit of a user entered number 
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int last = num % 10;
        int first = 0;

        while(num >= 10){
            num = num / 10;
        }
        first = num;
        int sum = first + last;
        System.out.println("Sum of first and last digit: " + sum);
    }
}
