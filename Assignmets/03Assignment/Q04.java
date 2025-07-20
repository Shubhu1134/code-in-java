// Q.04  -->calculate the sum of the series  1, 2, ,3,4,5......n;

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number ");
        int n = sc.nextInt();
        int i = 1;
        int a =0;

    while(i <=n){
       
    a= a+i;
         System.out.println(a);
         i++;
         

    }
    System.out.println("Sum of the series is :"+ a);

    }
}