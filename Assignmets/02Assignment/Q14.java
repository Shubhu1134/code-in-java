/* 14. Accept percentage and display grade.
*/

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        int p = sc.nextInt();

        if(p > 90) {
            System.out.println("Grade A");
        } else if(p > 80 && p <= 90) {
            System.out.println("Grade B");
        } else if(p >= 60 && p <= 80) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
    }
}
