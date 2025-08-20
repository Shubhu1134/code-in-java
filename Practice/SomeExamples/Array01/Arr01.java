import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int i ;
        int count= 0   ;
         System.out.println( "enter a number ");
         double n = sc.nextInt();
       
        for(i = 1 ;i<n; i++ ){
            n= n/10;
            count++;
        }
          System.out.println(count);
    }
}