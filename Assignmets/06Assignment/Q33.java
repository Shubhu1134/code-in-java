/*
Q33. Write a Java program to implement Binary Search algorithm
*/
import java.util.Scanner;
class Test{
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in){

            System.out.println(" Enter the size of an array : "); 
            int n = sc.nextInt(); 

            int arr[] = new int[n];

            System.out.println(" Enter "+ n+ " elemnt in shorted order : ");
            for (int i = 0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            Syetem.out.print(" enter the element : "); 
            int target = sc.nextInt(); 

            int index = binarySearch(arr, target );
        }
    }
}