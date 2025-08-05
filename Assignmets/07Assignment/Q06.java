import java.util.Scanner;

class Test {
 public static void main (String args[]){
    Scanner sc = new Scanner(System.in);

     System.out.println("Eneter the order of the matrix");
     int n = sc.nextInt();
     int m = sc.nextInt();

     int arr[][] = newe int [n][m];


       for(int r=0; r<n; r++){
         System.out.println("Enter "+n+" element of "+(r+1)+" row");
         for(int c=0; c<m; c++){
           arr[r][c] =  sc.nextInt();
         }
       }
       System.out.println("Given Matrix..");
       for(int r=0; r<m; r++){
          for(int c=0; c<n; c++){
            System.out.print(arr[r][c]+" ");
          }
          System.out.println();
        }
     }
 }    
