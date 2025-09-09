import java.util.Scanner;

class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println(" Enter 1st value :");
            int a = sc.nextInt();
            
            System.out.println(" Enter 2nd number :");
            int b= sc.nextInt();

            int c = a/b;
            System.out.println("Result :"+ c);
        }
        catch(ArithmeticException e){
            
        }
    }
}