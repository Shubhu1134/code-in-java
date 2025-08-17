// Q05. Write a Java program to compare two strings lexicographically
// Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.

import java.util.Scanner;

class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int minLength = (s1.length() < s2.length()) ? s1.length() : s2.length();
        int result = 0;

        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                result = s1.charAt(i) - s2.charAt(i);
                break;
            }
        }

        if (result == 0) {
            result = s1.length() - s2.length();
        }

        if (result == 0) {
            System.out.println("Strings are lexicographically equal.");
        } else if (result < 0) {
            System.out.println("First string is lexicographically smaller.");
        } else {
            System.out.println("First string is lexicographically greater.");
        }
    }
}
    