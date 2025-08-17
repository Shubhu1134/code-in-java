// 33. Write a Java program to find the maximum occurring character in a string
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int maxCount = 0;
        char maxChar = ' ';
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            int count = 0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == c){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                maxChar = c;
            }
        }
        System.out.println("Maximum occurring character: " + maxChar + " (count: " + maxCount + ")");
    }
}
