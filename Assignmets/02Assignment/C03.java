// 3. WAP to calculate the percentage of students

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total marks: ");
        double total = sc.nextDouble();
        System.out.print("Enter obtained marks: ");
        double obtained = sc.nextDouble();
        double percentage = (obtained / total) * 100;
        System.out.println("Percentage: " + percentage + "%");
    }
}
