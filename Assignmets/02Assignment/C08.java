// 8. WAP to check whether number is even or odd

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}
