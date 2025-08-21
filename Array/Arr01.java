import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array :");

        int n = sc.nextInt();
        int arr[]= new int[n];

        for (int i = 0; i<n ; i++){
           System.out.println(" enter the "+i + " "+ "element :");
           arr[i]= sc.nextInt();

        }

        for (int i= 0 ; i<n; i++){
            int s = i+1;
         
            System.out.println("element "+" "+s+ ": "+ arr[i]);
        }

    }
}