import java.util.Scanner;

public class OperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Arithmetic Operators
        System.out.println("\nArithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));

        // Logical Operators
        System.out.println("\nLogical Operators:");
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Unary & Ternary
        System.out.println("\nUnary Operators:");
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b));

        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + max);

        // Type Casting
        System.out.println("\nType Casting:");
        double d = a;  // Widening
        int i = (int) d;  // Narrowing
        System.out.println("Widening: int to double = " + d);
        System.out.println("Narrowing: double to int = " + i);

        scanner.close();
    }
}
