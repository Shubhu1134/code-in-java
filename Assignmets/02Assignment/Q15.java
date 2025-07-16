/* 15. Accept cost price of bike and print road tax.
*/

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price of bike: ");
        int price = sc.nextInt();

        if(price > 100000) {
            System.out.println("Tax = 15%");
        } else if(price > 50000 && price <= 100000) {
            System.out.println("Tax = 10%");
        } else {
            System.out.println("Tax = 5%");
        }
    }
}
