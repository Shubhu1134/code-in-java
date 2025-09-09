// 9. Throws Keyword

// 👉 Write a method readFile(String fileName) that uses FileReader. Declare it with throws IOException and handle it in main().


// 9. Throws Keyword

import java.io.*;   
import java.util.Scanner;

class Test {

  
    static void readFile(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);  // may throw IOException
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String name = sc.nextLine();

        try {
            readFile(name); 
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
