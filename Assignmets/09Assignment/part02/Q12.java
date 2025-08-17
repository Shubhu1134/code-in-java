// 12. Write a Java program to check whether two String objects contain the same data
import java.util.Scanner;

class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        boolean same = true;

        if(str1.length() != str2.length()) {
            same = false;
        } else {
            for(int i=0; i<str1.length(); i++) {
                if(str1.charAt(i) != str2.charAt(i)) {
                    same = false;
                    break;
                }
            }
        }

        if(same)
            System.out.println("Both strings contain the same data.");
        else
            System.out.println("Strings are different.");
    }
}
