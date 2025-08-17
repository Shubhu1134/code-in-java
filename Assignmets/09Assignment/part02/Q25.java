// 25. Write a Java program to return the sum of the digits present in the given string. If there are no digits the sum return is 0
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        System.out.println("Sum of digits: " + sum);

        sc.close();
    }
}
