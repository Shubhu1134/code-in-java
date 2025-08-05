// 2. WAP to calculate the sum of the all elments of the array 

import java.util.Scanner;
class Test{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n =sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        
         for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         System.out.println("sum of all elements is :");
           for (int i = 0; i < n; i++) {

                 sum += arr[i];
        }
          System.out.print(sum+ " ");





    }
}