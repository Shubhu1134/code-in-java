// 34. Write a Java program to reverse words in a given string
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        String result = "";
        for(int i=words.length-1;i>=0;i--){
            result += words[i] + " ";
        }
        System.out.println("Reversed words string: " + result.trim());
    }
}
