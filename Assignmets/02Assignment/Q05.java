/* 5. Take age of 3 people and find oldest and youngest.
*/

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age1: ");
        int a = sc.nextInt();

        System.out.print("Enter age2: ");
        int b = sc.nextInt();

        System.out.print("Enter age3: ");
        int c = sc.nextInt();

        // Oldest
        if(a > b && a > c) {
            System.out.println("Oldest is: " + a);
        } else if(b > c) {
            System.out.println("Oldest is: " + b);
        } else {
            System.out.println("Oldest is: " + c);
        }

        // Youngest
        if(a < b && a < c) {
            System.out.println("Youngest is: " + a);
        } else if(b < c) {
            System.out.println("Youngest is: " + b);
        } else {
            System.out.println("Youngest is: " + c);
        }
    }
}
