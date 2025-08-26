// Question1_OOP_Theory.java
// What is Object oriented? Write down difference b/w Object oriented and procedure oriented programming approach.

/*
OBJECT-ORIENTED PROGRAMMING (OOP):
Object-Oriented Programming is a programming paradigm based on the concept of "objects" 
which contain data (attributes/fields) and code (methods/functions) that manipulates that data.

KEY CONCEPTS OF OOP:
1. Class: A blueprint or template for creating objects
2. Object: An instance of a class
3. Encapsulation: Bundling data and methods together, hiding internal details
4. Inheritance: Creating new classes based on existing classes
5. Polymorphism: Same interface with different implementations
6. Abstraction: Hiding complex implementation details

DIFFERENCES BETWEEN OOP AND PROCEDURAL PROGRAMMING:

OBJECT-ORIENTED PROGRAMMING:
- Focus: Objects and Classes
- Data Security: High (through encapsulation and access modifiers)
- Code Reusability: High (through inheritance and polymorphism)
- Problem Solving: Bottom-up approach
- Data and Functions: Bundled together in classes
- Modularity: High
- Maintenance: Easier to maintain and modify
- Real-world modeling: Excellent (models real-world entities as objects)
- Examples: Java, C++, Python, C#

PROCEDURAL PROGRAMMING:
- Focus: Functions/Procedures
- Data Security: Low (global data is accessible everywhere)
- Code Reusability: Limited (functions can be reused but not extended easily)
- Problem Solving: Top-down approach
- Data and Functions: Separate entities
- Modularity: Low to Medium
- Maintenance: Difficult for large programs
- Real-world modeling: Poor (doesn't naturally model real-world entities)
- Examples: C, Pascal, FORTRAN, COBOL

ADVANTAGES OF OOP:
1. Better code organization and structure
2. Code reusability through inheritance
3. Easy maintenance and modification
4. Data security through encapsulation
5. Real-world problem modeling
6. Scalability for large applications

DISADVANTAGES OF OOP:
1. Slower execution compared to procedural programming
2. Larger program size
3. More complex for simple problems
4. Requires more memory
5. Learning curve is steeper
*/

public class Question1_OOP_Theory {
    public static void main(String[] args) {
        System.out.println("=== OBJECT-ORIENTED PROGRAMMING CONCEPTS ===");
        System.out.println();
        
        System.out.println("OOP is based on four main principles:");
        System.out.println("1. Encapsulation - Data hiding and bundling");
        System.out.println("2. Inheritance - Code reusability");
        System.out.println("3. Polymorphism - Same interface, different behavior");
        System.out.println("4. Abstraction - Hiding complex details");
        System.out.println();
        
        System.out.println("Key differences from Procedural Programming:");
        System.out.println("- OOP focuses on objects, Procedural focuses on functions");
        System.out.println("- OOP provides better data security");
        System.out.println("- OOP offers higher code reusability");
        System.out.println("- OOP uses bottom-up approach, Procedural uses top-down");
    }
}