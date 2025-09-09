import java.util.Scanner;
class Test {

       public static void display(){
            System.out.println("exception is display");
        }
    public static void main (String args[] ){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st value :");
        int a = sc.nextInt();

        System.out.println("enter 2nd value :");
        int b = sc.nextInt();

     

        try{
            int c = a/b;
            System.out.println("Result :"+ c);
        
        }
        catch (ArithmeticException e){
            System.out.println("exception Caught");
            e.printStackTrace();
            display();
        }
        System.out.println(" At the end.....");
    }
}