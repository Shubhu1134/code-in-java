// Q02. Write a Java program to get the character at the given index within the String

import java.util.Scanner;

class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        if (index >= 0 && index < s.length()) {
            char c = s.charAt(index);
            System.out.println("Character at index " + index + ": " + c);
        } else {
            System.out.println("Invalid index!");
        }
    }
}
