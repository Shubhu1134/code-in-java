// WAP TO ENTER N ELEMENT IN ARRAY AND PRINT ARRAY 

import java.util.Scanner;
class test {
    public static void main(String args []){
     Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array :");
        int n = sc.nextInt();

        int [] array = new int[n];
        System.out.println("Enter "+ n + "element :");

        for (int i=0 ; i<n; i++);{
            array[i] = sc.nextInt();
     
        }
        System.out.println("array elements are :");
        for(int i=0 ; i<n ; i++){
            System.out.print(array[i] +" ");
            
        }
    }
}