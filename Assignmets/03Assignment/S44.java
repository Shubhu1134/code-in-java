// Q44: WAP to interchange first and last digit of a number
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int last = num % 10;
        int first = 0, pow = 1;

        while(num >= 10){
            num /= 10;
            pow *= 10;
        }
        first = num;
        int middle = original % pow;
        middle = middle / 10;

        int result = last * pow + middle * 10 + first;
        System.out.println("After interchange: " + result);
    }
}
