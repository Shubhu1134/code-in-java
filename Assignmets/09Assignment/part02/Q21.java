// 21. Write a Java program to check whether a given string starts with the contents of another string
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the main string: ");
        String mainStr = sc.nextLine();

        System.out.println("Enter the starting string to check: ");
        String startStr = sc.nextLine();

        if (mainStr.startsWith(startStr)) {
            System.out.println("Yes, the string starts with '" + startStr + "'");
        } else {
            System.out.println("No, the string does not start with '" + startStr + "'");
        }

        sc.close();
    }
}
