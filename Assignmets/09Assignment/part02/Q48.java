// 48. Write a program to String concatenation with primitive data type values
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int a = sc.nextInt();

        System.out.println("Enter a double:");
        double b = sc.nextDouble();

        String str = "Value of int: " + a + " and double: " + b;
        System.out.println(str);
    }
}
