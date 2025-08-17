// 50. Write a program to separate all tokens (words) using StringTokenizer
import java.util.Scanner;
import java.util.StringTokenizer;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        System.out.println("Tokens are:");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
