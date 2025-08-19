// 30. Write a Java program How to search a word inside a string?
import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string: ");
        String str = sc.nextLine();

        System.out.println("Enter the word to search: ");
        String word = sc.nextLine();

        if (str.contains(word)) {
            System.out.println("The word is present in the string.");
        } else {
            System.out.println("The word is NOT present in the string.");
        }
    }
}
