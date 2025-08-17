// 11. Write a Java program to check whether a given string ends with the contents of another string
import java.util.Scanner;

class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        boolean ends = false;

        if(str2.length() <= str1.length()) {
            int startIndex = str1.length() - str2.length();
            String sub = "";
            for(int i=startIndex; i<str1.length(); i++) {
                sub += str1.charAt(i);
            }
            if(sub.equals(str2)) {
                ends = true;
            }
        }

        if(ends)
            System.out.println("Yes, first string ends with second string.");
        else
            System.out.println("No, first string does not end with second string.");
    }
}
