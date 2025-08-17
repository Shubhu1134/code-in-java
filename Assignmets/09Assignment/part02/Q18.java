// 18. Write a java program to get the length of a given string
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        System.out.println(length);
    }
}
