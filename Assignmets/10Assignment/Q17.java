class Employee {
    private int empNo;
    private double salary;
    private static int count = 0;
    private static double totalSalary = 0;

    Employee(double salary) {
        this.salary = salary;
        empNo = ++count;
        totalSalary += salary;
    }

    static void displayStats() {
        System.out.println("Total Employees: " + count);
        System.out.println("Total Salary: " + totalSalary);
    }
}

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee(5000);
        Employee e2 = new Employee(6000);
        Employee e3 = new Employee(7000);
        Employee.displayStats();
    }
}
