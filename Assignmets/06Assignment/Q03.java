// Q.3 Write a program to reverse the array.

import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("entre the size of the array ");
        int n = sc.nextInt();
        
        int []arr = new int[n];

        System.out.println("enter elements :");
        for(int i =0; i<n; i++){
            arr [i]=sc.nextInt();
           
           
        }
        
        
        for(int i=0; i<n/2; i++){
            int temp = arr [i];
            arr[i]= arr[n-1-i];
            arr[n-1-i]= temp;
        }

        System.out.println("Reversed array :");
        for(int num :arr){
            System.out.print(num+ " ");
        }


    }
}