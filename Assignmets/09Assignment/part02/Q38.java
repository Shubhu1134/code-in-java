// 38. Write a Java program to Given string Convert Lowercase to Uppercase

import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string in lowercase: ");
        String str = sc.nextLine();
        System.out.println("Uppercase String: " + str.toUpperCase());
    }
}
