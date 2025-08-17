// 42. Write a program to Replace string with another string in java using String.replace() method
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter original string: ");
        String str = sc.nextLine();
        System.out.println("Enter word to replace: ");
        String oldWord = sc.nextLine();
        System.out.println("Enter new word: ");
        String newWord = sc.nextLine();

        String replaced = str.replace(oldWord, newWord);
        System.out.println("After replacement: " + replaced);
    }
}
