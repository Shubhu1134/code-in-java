// Q47: WAP to print tables of all the numbers between two entered numbers
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start and end number: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i = start; i <= end; i++){
            System.out.println("Table of " + i + ":");
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
}
