// 45. Write a program to Compare the strings using equals(), compareTo() and == operator
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();

        // equals()
        if(s1.equals(s2)){
            System.out.println("Using equals(): Strings are equal");
        } else {
            System.out.println("Using equals(): Strings are not equal");
        }

        // compareTo()
        int result = s1.compareTo(s2);
        if(result == 0){
            System.out.println("Using compareTo(): Strings are equal");
        } else if(result > 0){
            System.out.println("Using compareTo(): First string is greater");
        } else {
            System.out.println("Using compareTo(): Second string is greater");
        }

        // == operator (compares references)
        if(s1 == s2){
            System.out.println("Using == : Both strings refer to same object");
        } else {
            System.out.println("Using == : Both strings are different objects");
        }
    }
}
