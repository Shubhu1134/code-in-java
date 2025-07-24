// Q29: 1, 11, 111, 1111 …
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        long n = sc.nextInt();
        long num = 1 ,i =1;
        System.out.print(num + " ");
        while(i<n){
            num = num*10+1;
        System.out.print(num + " ");
         i++;
        }
        }
    }

