// 21. Check if triangle is valid based on angles

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three angles: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b + c == 180)
            System.out.println("Valid triangle");
        else
            System.out.println("Invalid triangle");
    }
}
