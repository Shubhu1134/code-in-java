import java.util.Scanner;

public class VariablesDemo {
    public static void main(String[] args) {
        // Scanner for input
        Scanner scanner = new Scanner(System.in);

        // Integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Float input
        System.out.print("Enter your height in meters: ");
        float height = scanner.nextFloat();

        // Char input
        System.out.print("Enter your grade: ");
        char grade = scanner.next().charAt(0);

        // Boolean
        boolean isStudent = true;

        // Output
        System.out.println("\n--- Details ---");
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "m");
        System.out.println("Grade: " + grade);
        System.out.println("Are you a student? " + isStudent);

        scanner.close();
    }
}
