// Q6. Write a Java program to compare two strings lexicographically, ignoring case differences
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int result = str1.compareToIgnoreCase(str2);

        if (result == 0) {
            System.out.println("Strings are equal (ignoring case).");
        } else if (result < 0) {
            System.out.println("First string is lexicographically smaller (ignoring case).");
        } else {
            System.out.println("First string is lexicographically greater (ignoring case).");
        }
    }
}
