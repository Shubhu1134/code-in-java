// 19. Check if triangle is equilateral, isosceles, or scalene

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides of triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c)
            System.out.println("Equilateral triangle");
        else if (a == b || b == c || a == c)
            System.out.println("Isosceles triangle");
        else
            System.out.println("Scalene triangle");
    }
}
