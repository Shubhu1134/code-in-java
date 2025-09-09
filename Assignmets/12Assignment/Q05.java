// 5. Multiple Catch Blocks

// 👉 Take two integers and perform division. Handle both ArithmeticException and InputMismatchException separately.

import java.util.Scanner;
import java.util.InputMismatchException;
class Test {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st number :");
        int a = sc.nextInt();

        System.out.println(" enter 2nd number : ");
        

        try{
            int b = sc.nextInt();
            int c = a/b;
        }
        catch(ArithmeticException e){
           System.out.println(e);
        }
        catch(InputMismatchException e){
          System.out.println(e);
        }
        sc.close();
    }
}