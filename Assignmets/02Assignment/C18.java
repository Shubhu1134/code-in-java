// 18. Check even or odd without using % operator

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if ((num & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
