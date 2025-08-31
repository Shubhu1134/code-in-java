//lets practice some array problem ===?
// write a program to enter n element in an array and print them.

import java.util.Scanner;

class MyArray{
    private int size;
    private int [] arr;

    public MyArray(int size){
        this.size = size;
        arr =new int [size];

        
    }

    public void inputValues(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter "+ size+ " element ");

        for(int i=0; i<size ; i++ ){
        arr[i]= sc.nextInt();
        }
        
    }
    public void PrintValues(){
        for(int i = 0; i<size ; i++){
            System.out.println("element "+" "+i+ " "+arr[i]);
        }
    }

}

class Test{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);


         System.out.print("Enter size of array: ");
         int n = sc.nextInt();

         MyArray a = new MyArray(n);
         a.inputValues();
         a.PrintValues();
    }
}