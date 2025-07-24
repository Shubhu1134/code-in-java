// 34) WAP to check whether entered number is perfect or not

import java.util.Scanner;
class Test {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = 0,i=1;
       while(i<=num){
            if (num % i == 0) sum += i;
        }
        if (sum == num)
            System.out.println("Perfect number");
        else
            System.out.println("Not a perfect number");
    
         i++;
    
    }


}
