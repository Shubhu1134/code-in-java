// 8. Checked vs Unchecked Exception

// 👉 Write a program with a method that throws IOException (checked) and another that throws ArithmeticException (unchecked). Show the difference in compiler behavior.





import java.io.*; 

class Test {

    
    static void readFile() throws IOException {
        throw new IOException("File not found!");
    }

   
    static void divideByZero() {
        throw new ArithmeticException("Division by zero!");
    }

    public static void main(String[] args) {
        
        try {
            readFile();  
        } catch (IOException e) {
            System.out.println("Caught Checked Exception: " + e.getMessage());
        }

       
        divideByZero();  
        System.out.println("This line will not execute after unchecked exception");
    }
}
