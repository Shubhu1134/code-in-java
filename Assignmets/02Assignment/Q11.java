/* 11. Ask user to enter age, sex (M/F), marital status (Y/N)
       and print place of service based on conditions.
*/

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter sex (M/F): ");
        char sex = sc.next().charAt(0);

        System.out.print("Enter marital status (Y/N): ");
        char status = sc.next().charAt(0);

        if(sex == 'F' || sex == 'f') {
            System.out.println("She will work only in urban areas");
        } else if(sex == 'M' || sex == 'm') {
            if(age >= 20 && age <= 40) {
                System.out.println("He may work anywhere");
            } else if(age > 40 && age <= 60) {
                System.out.println("He will work only in urban areas");
            } else {
                System.out.println("ERROR");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
