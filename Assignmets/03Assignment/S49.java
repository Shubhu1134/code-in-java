// Q49: WAP to find out all the perfect numbers between two entered numbers
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start and end: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i = start; i <= end; i++){
            int sum = 0;
            for(int j = 1; j < i; j++){
                if(i % j == 0){
                    sum += j;
                }
            }
            if(sum == i){
                System.out.println(i + " is a perfect number");
            }
        }
    }
}
