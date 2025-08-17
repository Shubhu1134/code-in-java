// 43. Write a program to Convert any type of value to string value using String.valueOf() method
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 100;
        double d = 12.34;
        boolean flag = true;

        String s1 = String.valueOf(num);
        String s2 = String.valueOf(d);
        String s3 = String.valueOf(flag);

        System.out.println("Integer to String: " + s1);
        System.out.println("Double to String: " + s2);
        System.out.println("Boolean to String: " + s3);
    }
}
