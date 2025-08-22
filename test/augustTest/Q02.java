// Q2. (3 Marks)

// Write a Java program to find the second largest number in an array.

// Example Input: {10, 5, 20, 8, 25, 3}

// Example Output: Second Largest = 20



import java.util.Scanner;
class Test{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n =sc.nextInt();
        int heigh = 0;
        int secondHeigh = 0 , temp = 0; 
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        
         for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         System.out.println("heigh among all elements is :");
           for (int i = 0; i < n; i++) {
                 if (heigh<arr[i])
                 {
                    heigh = arr[i];
                    
                 }  

        }
        
        
             System.out.println(heigh+ " ");
                 
               

        }
        
    }

