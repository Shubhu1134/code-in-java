// 6. Write a Java program to create a class called "Employee"
// with a name, job title, and salary attributes, and methods
// to calculate and update salary.

class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public Employee() {}

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public String getJobTitle() {
        return jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    public void updateSalary(double amount) {
        salary += amount;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}

class TestMain {
    public static void main(String args[]) {
        Employee e1 = new Employee("John Doe", "Software Engineer", 50000);
        Employee e2 = new Employee("Jane Smith", "Manager", 70000);

        System.out.println("Employee 1:");
        e1.display();

        System.out.println("\nEmployee 2:");
        e2.display();

        e1.updateSalary(5000);
        System.out.println("\nAfter salary update for Employee 1:");
        e1.display();
    }
}
