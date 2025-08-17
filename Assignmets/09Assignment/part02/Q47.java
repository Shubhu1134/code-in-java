// 47. Write a program to Convert a character array to string
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter characters (without space, e.g. hello):");
        String input = sc.nextLine();
        char arr[] = input.toCharArray();

        String str = new String(arr);

        System.out.println("Converted string: " + str);
    }
}
