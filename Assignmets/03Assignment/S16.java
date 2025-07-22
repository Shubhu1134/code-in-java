// 16) …... -6 -3 0 3 6 9 ……. n terms

import java.util.Scanner;
class Test {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n terms: ");
        int n = sc.nextInt();
        int i = -n ; 
        System.out.println(-n);
        while(i<n){
            i= i+3;
            System.out.println(i);
        
        }
    }
}

