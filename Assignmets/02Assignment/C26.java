// 26. Calculate percentage and grade of 5 subjects

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        String[] subjects = {"Physics", "Chemistry", "Biology", "Maths", "Computer"};
        
        for (String sub : subjects) {
            System.out.print("Enter marks for " + sub + ": ");
            total += sc.nextInt();
        }

        double percent = total / 5.0;
        System.out.println("Percentage: " + percent + "%");

        if (percent >= 90) System.out.println("Grade A");
        else if (percent >= 80) System.out.println("Grade B");
        else if (percent >= 70) System.out.println("Grade C");
        else if (percent >= 60) System.out.println("Grade D");
        else if (percent >= 40) System.out.println("Grade E");
        else System.out.println("Grade F");
    }
}
