// 20. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String regex = sc.nextLine();
        String replacement = sc.nextLine();

        String result = "";
        int i = 0;
        while (i < str.length()) {
            boolean match = true;
            if (i + regex.length() <= str.length()) {
                for (int j = 0; j < regex.length(); j++) {
                    if (str.charAt(i + j) != regex.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    result += replacement;
                    i += regex.length();
                    continue;
                }
            }
            result += str.charAt(i);
            i++;
        }
        System.out.println(result);
    }
}
