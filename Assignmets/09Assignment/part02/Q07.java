// Q7. Write a Java program to concatenate a given string to the end of another string
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String result = str1.concat(str2);

        System.out.println("Concatenated string: " + result);
    }
}
