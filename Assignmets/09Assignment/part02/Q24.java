// 24. Write a Java program to create a new string repeating every character twice of a given string
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }

        System.out.println("New string: " + result);

        sc.close();
    }
}
