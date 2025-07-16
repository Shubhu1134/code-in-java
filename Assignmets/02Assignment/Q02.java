/* 2. A shop will give 10% discount if cost is more than 1000.
       One unit costs 100. Ask user for quantity.
*/

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        int cost = qty * 100;

        if(cost > 1000) {
            cost = cost - (cost * 10 / 100);
        }

        System.out.println("Total cost = " + cost);
    }
}
