// 22. Write a Java program to get a substring of a given string between two specified positions
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Enter start index: ");
        int start = sc.nextInt();

        System.out.println("Enter end index: ");
        int end = sc.nextInt();

        if (start >= 0 && end <= str.length() && start < end) {
            String sub = str.substring(start, end);
            System.out.println("Substring is: " + sub);
        } else {
            System.out.println("Invalid indices.");
        }

        sc.close();
    }
}
