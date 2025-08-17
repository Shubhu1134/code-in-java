// 32. Write a Java program to print after removing duplicates from a given string
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String result = "";
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(result.indexOf(c) == -1){
                result += c;
            }
        }
        System.out.println("String without duplicates: " + result);
    }
}
