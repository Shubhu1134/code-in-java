// 46. Write a program to First alphabet capital of each word in given string
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String words[] = str.split(" ");
        String result = "";

        for (String w : words) {
            if (w.length() > 0) {
                result += Character.toUpperCase(w.charAt(0)) + w.substring(1).toLowerCase() + " ";
            }
        }

        System.out.println("After capitalizing first letter: " + result.trim());
    }
}
