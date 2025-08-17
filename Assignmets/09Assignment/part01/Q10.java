// 10) WAP to count the word whose first letter is vowel.

import java.util.Scanner;

class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split("[ ,]+");
        int count = 0;

        for(int i=0; i<words.length; i++){
            char first = Character.toLowerCase(words[i].charAt(0));
            if(first=='a' || first=='e' || first=='i' || first=='o' || first=='u'){
                count++;
            }
        }

        System.out.println("Total words starting with vowel: " + count);
    }
}
