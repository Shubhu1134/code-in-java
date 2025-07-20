// Q.58: Check whether a number is Armstrong or not (3-digit)
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3-digit number:");
        int num = sc.nextInt();
        int sum = 0, temp = num;
        while (temp != 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp = temp / 10;
        }
        if (sum == num)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong");
    }
}
