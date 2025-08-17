// Q01. Write a Java program to concatenate two strings

import java.util.Scanner;

class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // Concatenate manually (without using + or built-in concat)
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            result = result + s1.charAt(i);
        }
        for (int i = 0; i < s2.length(); i++) {
            result = result + s2.charAt(i);
        } 

        System.out.println("Concatenated String: " + result);
    }
}
