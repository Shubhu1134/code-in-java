// Q2. (3 Marks) – Logic Based (String)

// Write a Java program to reverse each word in a string while keeping the word order same.
// Example:

// Input: "Java is very simple"
// Output: "avaJ si yrev elpmis"

import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println(" enter a sentance ");
        String str = sc.nextLine();


        char arr[]= str.toCharArray();
        int start = 0; 

        for (int i = 0; i<arr.length; i++){
            if (i== arr.length || arr[i]== ' '){
                for (int j = i-1; j>=start; j--){
                      System.out.println(arr[j]);
                 
                }
                if (i<arr.length){
                    System.out.println("");
                }
              
            }
               
        }
    }
}

