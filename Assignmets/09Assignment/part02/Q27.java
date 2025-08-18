// 27. Write a Java program to Swap Two Strings
import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();

        String temp = s1;
        s1 = s2;
        s2 = temp;

        System.out.println("After swapping:");
        System.out.println("First string: " + s1);
        System.out.println("Second string: " + s2);
    }
}
