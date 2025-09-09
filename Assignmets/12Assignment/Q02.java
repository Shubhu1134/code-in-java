// 2. InputMismatchException

// 👉 Ask the user to enter an integer. If the user enters text instead, catch the exception.

// // Expected
// Enter an integer: abc
// java.util.InputMismatchException caught

import java.util.Scanner;
import java.util.InputMismatchException;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

           System.out.println("enter an integer :");

       try {

        int n = sc.nextInt();
        System.out.println("you enter the number :"+n);

       }
       catch(InputMismatchException e){
       
        System.out.println(e +" caught ");
       }
       sc.close();
    }
}