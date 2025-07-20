// Q48: WAP to find out the factors of all the numbers between two entered numbers
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i = start; i <= end; i++){
            System.out.print("Factors of " + i + ": ");
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
