/* 8. Modify above: if attendance < 75, allow with medical cause (Y/N)
*/

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes held: ");
        int total = sc.nextInt();

        System.out.print("Enter classes attended: ");
        int attended = sc.nextInt();

        int percent = (attended * 100) / total;

        System.out.println("Attendance percentage: " + percent + "%");

        if(percent >= 75) {
            System.out.println("Allowed to sit in exam");
        } else {
            System.out.print("Do you have medical cause (Y/N)? ");
            char med = sc.next().charAt(0);

            if(med == 'Y' || med == 'y') {
                System.out.println("Allowed due to medical reason");
            } else {
                System.out.println("Not allowed to sit in exam");
            }
        }
    }
}
