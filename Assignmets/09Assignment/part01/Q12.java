// 12) Input data exactly in the following format, and print sum of all integer values.
// Sample Input: “67, 89, 23, 67, 12, 55, 66”.

import java.util.Scanner;

class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by comma: ");
        String data = sc.nextLine();

        String arr[] = data.split(",");   // split by comma
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += Integer.parseInt(arr[i].trim());  // remove spaces then convert to int
        }

        System.out.println("Sum = " + sum);
    }
}
