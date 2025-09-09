// 3. ArrayIndexOutOfBoundsException

// 👉 Create an array of size 5. Ask the user for an index and print the element. Handle the case when the index is out of range.

// // Expected
// Enter index: 8
// java.lang.ArrayIndexOutOfBoundsException caught

import java.util.Scanner;


class Test{
    public static void main(String args[]){
        
       Scanner sc = new Scanner(System.in);

       System.out.println("enter the size of the array :");
       int n = sc.nextInt();

        int arr []= new int[n];
        
        for (int i =0 ; i<n; i++){
        System.out.println(" enter element "+ (i+1));

        arr [i]= sc.nextInt();

        }

        System.out.println("print element of index :");
         

        try {
            int a = sc.nextInt();
            System.out.println(arr[a]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}