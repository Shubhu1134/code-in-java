// 35. Write a Java program to find maximum between two string
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        if(str1.compareTo(str2) > 0){
            System.out.println("Maximum string: " + str1);
        } else if(str1.compareTo(str2) < 0){
            System.out.println("Maximum string: " + str2);
        } else {
            System.out.println("Both strings are equal.");
        }
    }
}
