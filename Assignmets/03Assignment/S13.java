// 13) WAP to print N natural numbers in reverse order

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int i =n;
        System.out.print(n + " ");
       while(i>1){
        i--;
          System.out.print(i + " ");
       }
    }
}
   