// 15. Write a Java program to create a character array containing the contents of a string
import java.util.Scanner;

class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] arr = new char[str.length()];

        for(int i=0; i<str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        System.out.println("Character array contents:");
        for(char c : arr) {
            System.out.print(c + " ");
        }
    }
}
