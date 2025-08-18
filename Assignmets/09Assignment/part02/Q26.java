// 26. Write a Java program to Count words in Given String
import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String words[] = str.trim().split("\\s+"); 
        System.out.println("Number of words: " + words.length);
    }
}
