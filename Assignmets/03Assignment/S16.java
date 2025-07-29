// 16) …... -6 -3 0 3 6 9 ……. n terms

import java.util.Scanner;
class Test {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n terms: ");
        int n = sc.nextInt();
        int i = -n ; 
        System.out.println(i);
        while(i<n){
            if (n/3==0){
               i+= 3;
            }else{
                i++;
            }
               System.out.println(i);
         }  
    }
}

rr