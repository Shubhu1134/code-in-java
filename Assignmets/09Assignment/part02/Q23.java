// 23. Write a Java program to trim any leading or trailing whitespace from a given string
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string with spaces: ");
        String str = sc.nextLine();

        String trimmed = str.trim();
        System.out.println("Trimmed string: '" + trimmed + "'");

        sc.close();
    }
}
