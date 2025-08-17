// Q04. Write a Java program to count a number of Unicode code points in the specified text range of a String

import java.util.Scanner;

class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        if (start >= 0 && end <= s.length() && start < end) {
            int count = 0;
            for (int i = start; i < end; i++) {
                count++;
            }
            System.out.println("Number of Unicode code points: " + count);
        } else {
            System.out.println("Invalid range!");
        }
    }
}
