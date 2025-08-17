// 41. Write a program to Trim a given string using String.trim() method
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with spaces: ");
        String str = sc.nextLine();

        String trimmed = str.trim();
        System.out.println("Trimmed String: " + trimmed);
    }
}
