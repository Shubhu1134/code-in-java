// 4. WAP to exchange value to two variable with third variable and without third variable

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        // With third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("With temp: a = " + a + ", b = " + b);

        // Without third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Without temp: a = " + a + ", b = " + b);
    }
}
