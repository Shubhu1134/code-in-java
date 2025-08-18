// 14. Write a Java program to get the canonical representation of the string object
import java.util.Scanner;

class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Interning to get canonical representation
        String canonical = str.intern();

        System.out.println("Canonical representation: " + canonical);
    }
}
