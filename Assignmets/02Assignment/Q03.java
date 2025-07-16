/* 3. Company gives 5% bonus if service > 5 years.
       Ask salary and year of service. Print bonus.
*/

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter years of service: ");
        int year = sc.nextInt();

        if(year > 5) {
            int bonus = salary * 5 / 100;
            System.out.println("Bonus is: " + bonus);
        } else {
            System.out.println("No bonus");
        }
    }
}
