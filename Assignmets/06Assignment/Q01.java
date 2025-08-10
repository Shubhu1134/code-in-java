import java.util.Scanner;

class test{
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array :");

    int n = sc.nextInt();
    int [] arr= new int [n];

    for (int i=0; i<arr.length; i++){
        int arr[i]= sc.nextInt();
        System.out.println(arr[i]);
    }
    
    }
}