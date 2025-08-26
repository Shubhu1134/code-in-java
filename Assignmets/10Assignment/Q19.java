import java.util.*;

class Student {
    String name;
    int roll, age, score;

    Student(String n, int r, int a, int s) {
        name = n; roll = r; age = a; score = s;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name, roll, age, score: ");
            arr[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        System.out.println("Group [0-50]");
        for (Student s : arr) if (s.score <= 50) System.out.println(s.name);

        System.out.println("Group [50-65]");
        for (Student s : arr) if (s.score > 50 && s.score <= 65) System.out.println(s.name);

        System.out.println("Group [65-80]");
        for (Student s : arr) if (s.score > 65 && s.score <= 80) System.out.println(s.name);

        System.out.println("Group [80-100]");
        for (Student s : arr) if (s.score > 80) System.out.println(s.name);
    }
}
