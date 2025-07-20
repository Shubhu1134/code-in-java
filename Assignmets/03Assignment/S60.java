// 60) WAP to print Square, Cube and Square Root of all numbers from 1 to N

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            double sqrt = Math.sqrt(i);
            System.out.println("Number: " + i + ", Square: " + (i * i) + ", Cube: " + (i * i * i) + ", Square Root: " + sqrt);
        }
    }
}
