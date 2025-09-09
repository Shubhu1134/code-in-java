// 6. Finally Block Practice

// 👉 Open a Scanner, read an input, and always close the scanner in finally (show that finally always executes).

import java.util.Scanner;
import java.util.InputMismatchException;
class Test {
    public static void main(String args []){
    Scanner sc = new Scanner(System.in);

    System.out.println("entr input value ");

    try{
            int n = sc.nextInt();
            System.out.println(" the value u entered "+ n);
    }
   catch(InputMismatchException e){
    System.out.println(e);
   }
     finally{
        System.out.println(" end is reached......");
     }
    }
}