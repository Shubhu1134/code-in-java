// 17) 1 2 4 7 11 16 …… n terms

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n terms: ");
        int n = sc.nextInt();
        int a = 1, i = 1;

        System.out.println(a);
        while(i<=n){
            a= a+i;
            System.out.println(a);
            i++;
        }
    }
} 
