// import java.util.Scanner;

// class Test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter nuber of elements : ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter "+ n + " elements :");
//         for (int i =0; i<n; i++){
//             arr[i] = sc.nextInt();

//         }
//         System.out.println("Array elements are : ");
//         for(int i = 0; i <n ; i++){
//             System.out.print(arr[i] +" ");
//         }
//     }
// }
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter  the size of array ");
        int n = sc.nextInt();

        int []arr = new int [n];

        System.out.println("enter  "+ n+ "elemnts : ");
         for(int i=0 ; i<n ; i++){
            arr[i]= sc.nextInt();
         }
    }
}