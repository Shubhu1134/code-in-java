// 9) WAP to find word of maximum length in given String.
// Sample Input: “Dear Student ,You have need to work hard”
// Output: “Student”

import java.util.Scanner;

class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split("[ ,]+");
        String maxWord = words[0];

        for(int i=1; i<words.length; i++){
            if(words[i].length() > maxWord.length()){
                maxWord = words[i];
            }
        }

        System.out.println(maxWord);
    }
}
