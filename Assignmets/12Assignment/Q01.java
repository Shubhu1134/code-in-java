// 1. Divide by Zero Exception

// 👉 Write a program that takes two numbers from the user and divides them. Handle the case where the second number is zero.

// // Expected
// Enter first number: 10
// Enter second number: 0
// java.lang.ArithmeticException caught: / by zero

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        

        System.out.println("enter first number : ");
        int a = sc.nextInt();

        System.out.println(" enter second number :");
        int b = sc.nextInt();


        try{
            int c = a/b;
            System.out.println("result :"+ c);
        }
        catch(ArithmeticException e){
          e.printStackTrace();
          System.out.println(e);
        }
        sc.close();

    }
}