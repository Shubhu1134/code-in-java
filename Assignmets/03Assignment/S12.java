// 12) WAP to print Odd numbers upto N.

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            if (i%2==1){
                System.out.println(i);
            }
            i++;

        }
        
    }
}
