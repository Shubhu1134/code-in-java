// 27. Calculate gross salary based on basic salary

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double salary = sc.nextDouble();
        double hra, da;

        if (salary <= 10000) {
            hra = salary * 0.20;
            da = salary * 0.80;
        } else if (salary <= 20000) {
            hra = salary * 0.25;
            da = salary * 0.90;
        } else {
            hra = salary * 0.30;
            da = salary * 0.95;
        }

        double gross = salary + hra + da;
        System.out.println("Gross Salary: " + gross);
    }
}
