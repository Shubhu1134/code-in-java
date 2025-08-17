// Q8. Write a Java program to test if a given string contains the specified sequence of char values
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter sequence to check: ");
        String subStr = sc.nextLine();

        if (mainStr.contains(subStr)) {
            System.out.println("The main string contains the given sequence.");
        } else {
            System.out.println("The main string does not contain the given sequence.");
        }
    }
}
