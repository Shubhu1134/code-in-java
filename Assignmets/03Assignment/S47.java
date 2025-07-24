// Q47: WAP to print tables of all the numbers between two entered numbers
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start and end number: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int i=1, j=1;

       while (i<=end){
            System.out.println("Table of " + i + ":");
            while(i<=j){
                System.out.println(i + " x " + j + " = " + (i*j));
                j++;
            }
            System.out.println();

            i++;
        }
    }
}
