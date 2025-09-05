// Q: Write a Java program using OOP concepts for basic String operations

import java.util.Scanner;

// Class for String Operations
class StringOperations {
    private String text; // Encapsulation

    // Setter method
    public void setText(String text) {
        this.text = text;
    }

    // Getter method
    public String getText() {
        return this.text;
    }

    // Method to find length
    public int getLength() {
        return text.length();
    }

    // Method to convert to uppercase
    public String toUpper() {
        return text.toUpperCase();
    }

    // Method to reverse string
    public String reverse() {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }
        return rev;
    }
}

// Main class
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringOperations s = new StringOperations();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        s.setText(input); // store string in object

        // Using methods
        System.out.println("Original String: " + s.getText());
        System.out.println("Length: " + s.getLength());
        System.out.println("Uppercase: " + s.toUpper());
        System.out.println("Reversed: " + s.reverse());
    }
}
