// 1,4,9,16 .....n terms ; 

import java.util.Scanner; 
class Test{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter a number ");
        int n = sc.nextInt();
        int i =1 ; 
        int a= 0;

        while (i<=n ){
            a = i*i;
            System.out.println(a);
            i++;
        }
    }
}    