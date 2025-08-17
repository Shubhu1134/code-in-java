// 19. Write a Java program to replace a specified character with another character
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char oldChar = sc.next().charAt(0);
        char newChar = sc.next().charAt(0);

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == oldChar) {
                result += newChar;
            } else {
                result += c;
            }
        }
        System.out.println(result);
    }
}
