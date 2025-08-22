// Q1. (3 Marks) – Logic Based (Array)

// Write a Java program to remove duplicate elements from an array and print the unique elements.
// Example:

// Input: [1, 2, 2, 3, 4, 4, 5]
// Output: [1, 2, 3, 4, 5]

import java.util.Scanner; 

class Test {
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int count= 0; 
       
        int arr[]= new int [n];
        int result[]= new int [n];
        
         for(int i = 0; i<n; i++){
         System.out.println(" enter the "+ i+ " "+"element :");
            arr[i]= sc.nextInt();


         }
         for(int i=0; i<n; i++){
            for(int j = 1; j<n; j++){
                if(arr[i]=arr[j]){
               count++;
                }
            }
            
         }
    
         
      
    }
}