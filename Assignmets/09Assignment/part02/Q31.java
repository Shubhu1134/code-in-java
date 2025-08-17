// 31. Write a Java program to find first non repeating character in a string
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        char result = ' ';
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(str.indexOf(c) == str.lastIndexOf(c)){
                result = c;
                break;
            }
        }
        if(result != ' ')
            System.out.println("First non-repeating character: " + result);
        else
            System.out.println("No non-repeating character found.");
    }
}
