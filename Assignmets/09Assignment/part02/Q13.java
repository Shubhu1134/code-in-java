// 13. Write a Java program to get the contents of a given string as a byte array
import java.util.Scanner;

class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        byte[] bytes = new byte[str.length()];

        for(int i=0; i<str.length(); i++) {
            bytes[i] = (byte) str.charAt(i);
        }

        System.out.println("Byte array contents:");
        for(byte b : bytes) {
            System.out.print(b + " ");
        }
    }
}
