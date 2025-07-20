// Q50: WAP to find out all the palindrome numbers between two entered numbers
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start and end: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i = start; i <= end; i++){
            int rev = 0, temp = i;
            while(temp != 0){
                rev = rev * 10 + temp % 10;
                temp = temp / 10;
            }
            if(rev == i){
                System.out.println(i + " is palindrome");
            }
        }
    }
}
