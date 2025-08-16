import java.util.Scanner;

class Employee{
    private int id ;
    private String name ; 
    private double salary ; 

    public void setId(int id ){
        this.id = id; 
    }
    public void setName( String name ){
     this.name = name ; 
    }
   public void  setSalary( double salery ){
        this.salary = salary;

    }
    public void displayDetails(){
        System.out.println(" ---Employee Details ----");
        System.out.println(" ID   : "+ id);
        System.out.println(" Name  :  "+ name);
        System.out.println("Salery  :"+ salary);
    }

}

class Test {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        Employee obj = new Employee();

          System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

         System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        obj.displayDetails();

    sc.close();

    }
}