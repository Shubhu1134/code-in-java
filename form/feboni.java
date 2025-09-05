// Q: Write a Java program to print Fibonacci series using core logic and OOP concepts

import java.util.Scanner;

// Class to handle Fibonacci logic
class Fibonacci {
    private int n;  // number of terms

    // Setter method
    public void setN(int n) {
        this.n = n;
    }

    // Getter method
    public int getN() {
        return this.n;
    }

    // Method to generate and print Fibonacci series
    public void printSeries() {
        int first = 0, second = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

// Main class
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fibonacci fib = new Fibonacci();

        System.out.print("Enter number of terms: ");
        int num = sc.nextInt();

        fib.setN(num);   // set number of terms
        fib.printSeries();  // print Fibonacci series
    }
}


