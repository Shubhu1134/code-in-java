// Q43: WAP to convert binary number into decimal number
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        int binary = sc.nextInt();
        int decimal = 0, i = 0;

        while(binary != 0){
            int rem = binary % 10;
            decimal += rem * Math.pow(2, i);
            binary = binary / 10;
            i++;
        }
        System.out.println("Decimal: " + decimal);
    }
}
