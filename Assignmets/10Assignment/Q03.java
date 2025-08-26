// Question3_Setter_Getter_POJO.java
// What are the role of setter and getter method? What is POJO in Java?

/*
SETTER AND GETTER METHODS:

GETTER METHODS:
- Used to retrieve/access the value of private instance variables
- Provide controlled read access to private data
- Follow naming convention: get + PropertyName (e.g., getName())
- Return type matches the property type
- Usually public and have no parameters

SETTER METHODS:
- Used to set/modify the value of private instance variables
- Provide controlled write access to private data
- Follow naming convention: set + PropertyName (e.g., setName())
- Usually public, return void, and take one parameter
- Can include validation logic before setting the value

ROLES/BENEFITS:
1. Data Encapsulation - Hide internal data representation
2. Data Validation - Validate data before setting
3. Controlled Access - Control how data is accessed/modified
4. Flexibility - Can change internal implementation without affecting external code
5. Debugging - Add logging or breakpoints in getters/setters
6. Computed Properties - Can calculate values on-the-fly

POJO (Plain Old Java Object):
- Simple Java class that doesn't extend or implement any special classes/interfaces
- Contains only private fields and public getter/setter methods
- May have constructors (default and parameterized)
- No business logic, just data container
- Used for data transfer between layers
- Easy to understand, test, and maintain
*/

// Example of a class WITHOUT proper encapsulation (BAD PRACTICE)
class BadStudent {
    public String name;  // Direct access - no control
    public int age;      // No validation possible
    public double gpa;   // Anyone can modify directly
}

// Example of a class WITH proper encapsulation using getters/setters
class GoodStudent {
    private String name;
    private int age;
    private double gpa;
    private String email;
    
    // Constructor
    public GoodStudent() {}
    
    public GoodStudent(String name, int age, double gpa, String email) {
        setName(name);    // Use setter for validation
        setAge(age);      // Use setter for validation
        setGpa(gpa);      // Use setter for validation
        setEmail(email);  // Use setter for validation
    }
    
    // GETTER METHODS (Provide controlled read access)
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public String getEmail() {
        return email;
    }
    
    // SETTER METHODS (Provide controlled write access with validation)
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }
    
    public void setAge(int age) {
        if (age >= 16 && age <= 100) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be between 16 and 100");
        }
    }
    
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
    }
    
    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email.toLowerCase();
        } else {
            throw new IllegalArgumentException("Invalid email format");
        }
    }
    
    // Additional methods that use getters internally
    public String getGradeCategory() {
        if (getGpa() >= 3.5) return "Excellent";
        else if (getGpa() >= 3.0) return "Good";
        else if (getGpa() >= 2.0) return "Average";
        else return "Poor";
    }
    
    public boolean isAdult() {
        return getAge() >= 18;
    }
    
    public void displayInfo() {
        System.out.println("Student: " + getName() + 
                          ", Age: " + getAge() + 
                          ", GPA: " + getGpa() + 
                          ", Email: " + getEmail() + 
                          ", Grade: " + getGradeCategory());
    }
}

// POJO EXAMPLE 1: Simple Person POJO
class PersonPOJO {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    
    // Default constructor (required for POJO)
    public PersonPOJO() {}
    
    // Parameterized constructor
    public PersonPOJO(String firstName, String lastName, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    
    // Getter methods
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getPhoneNumber() { return phoneNumber; }
    
    // Setter methods
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    
    // toString method for easy display
    @Override
    public String toString() {
        return "Person{firstName='" + firstName + "', lastName='" + lastName + 
               "', age=" + age + ", phone='" + phoneNumber + "'}";
    }
}

// POJO EXAMPLE 2: Employee POJO with more fields
class EmployeePOJO {
    private int employeeId;
    private String name;
    private String department;
    private double salary;
    private String email;
    private String joiningDate;
    
    // Default constructor
    public EmployeePOJO() {}
    
    // Parameterized constructor
    public EmployeePOJO(int employeeId, String name, String department, 
                       double salary, String email, String joiningDate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.email = email;
        this.joiningDate = joiningDate;
    }
    
    // Getter methods
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public String getEmail() { return email; }
    public String getJoiningDate() { return joiningDate; }
    
    // Setter methods
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setEmail(String email) { this.email = email; }
    public void setJoiningDate(String joiningDate) { this.joiningDate = joiningDate; }
    
    @Override
    public String toString() {
        return "Employee{id=" + employeeId + ", name='" + name + 
               "', dept='" + department + "', salary=" + salary + 
               ", email='" + email + "', joining='" + joiningDate + "'}";
    }
}

// Main class to demonstrate getter/setter methods and POJO
public class Question3_Setter_Getter_POJO {
    public static void main(String[] args) {
        System.out.println("=== SETTER/GETTER METHODS & POJO DEMONSTRATION ===\n");
        
        // 1. Demonstrating BAD practice (direct field access)
        System.out.println("1. BAD PRACTICE - Direct field access:");
        BadStudent badStudent = new BadStudent();
        badStudent.name = "John";
        badStudent.age = -5;        // Invalid age, but no validation!
        badStudent.gpa = 5.0;       // Invalid GPA, but no validation!
        System.out.println("Bad Student: " + badStudent.name + 
                          ", Age: " + badStudent.age + ", GPA: " + badStudent.gpa);
        System.out.println("Problems: No validation, no control, data can be corrupted!\n");
        
        // 2. Demonstrating GOOD practice (getter/setter methods)
        System.out.println("2. GOOD PRACTICE - Using getter/setter methods:");
        try {
            GoodStudent goodStudent = new GoodStudent();
            goodStudent.setName("Alice Johnson");
            goodStudent.setAge(20);
            goodStudent.setGpa(3.8);
            goodStudent.setEmail("alice@university.edu");
            
            System.out.println("Good Student created successfully:");
            goodStudent.displayInfo();
            System.out.println("Is Adult: " + goodStudent.isAdult());
            
            // Demonstrating validation
            System.out.println("\nTrying to set invalid values...");
            try {
                goodStudent.setAge(-5);  // This will throw exception
            } catch (IllegalArgumentException e) {
                System.out.println("Age validation error: " + e.getMessage());
            }
            
            try {
                goodStudent.setGpa(5.0);  // This will throw exception
            } catch (IllegalArgumentException e) {
                System.out.println("GPA validation error: " + e.getMessage());
            }
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating student: " + e.getMessage());
        }
        
        System.out.println("\n" + "=".repeat(50));
        
        // 3. POJO Demonstration
        System.out.println("\n3. POJO (Plain Old Java Object) Examples:");
        
        // Using default constructor and setters
        PersonPOJO person1 = new PersonPOJO();
        person1.setFirstName("John");
        person1.setLastName("Smith");
        person1.setAge(25);
        person1.setPhoneNumber("123-456-7890");
        
        System.out.println("Person 1 (using setters): " + person1);
        
        // Using parameterized constructor
        PersonPOJO person2 = new PersonPOJO("Jane", "Doe", 30, "098-765-4321");
        System.out.println("Person 2 (using constructor): " + person2);
        
        // Accessing data using getters
        System.out.println("Person 2 details using getters:");
        System.out.println("Full Name: " + person2.getFirstName() + " " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Phone: " + person2.getPhoneNumber());
        
        System.out.println();
        
        // Employee POJO example
        EmployeePOJO emp1 = new EmployeePOJO(101, "Robert Wilson", "IT", 75000.0, 
                                           "robert@company.com", "2023-01-15");
        System.out.println("Employee 1: " + emp1);
        
        EmployeePOJO emp2 = new EmployeePOJO();
        emp2.setEmployeeId(102);
        emp2.setName("Sarah Davis");
        emp2.setDepartment("HR");
        emp2.setSalary(65000.0);
        emp2.setEmail("sarah@company.com");
        emp2.setJoiningDate("2023-03-20");
        System.out.println("Employee 2: " + emp2);
        
        System.out.println("\n" + "=".repeat(50));
        
        // 4. Benefits Summary
        System.out.println("\n4. BENEFITS OF GETTERS/SETTERS AND POJO:");
        System.out.println("✓ Data Validation and Integrity");
        System.out.println("✓ Controlled Access to Private Data");
        System.out.println("✓ Flexibility to Change Internal Implementation");
        System.out.println("✓ Easy to Debug and Maintain");
        System.out.println("✓ Supports Encapsulation Principle");
        System.out.println("✓ Framework Compatibility (Spring, Hibernate, etc.)");
        System.out.println("✓ Easy Data Transfer Between Layers");
    }
}