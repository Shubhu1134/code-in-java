// Q.2  -- 1,2,3,4....n{limit}
import java.util.Scanner;
class Test{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number ");
        int i = 1; 
        int n = sc.nextInt();

        while(i<=n ){
            System.out.println(i);
            i++;
       
        }



    }
}