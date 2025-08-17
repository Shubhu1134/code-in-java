// 7) WAP to remove the duplicate letters from given String.
// Sample Input: “aabbccddd”
// Output: “abcd”

import java.util.Scanner;

class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        
        String result = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            boolean found = false;
            for(int j=0; j<result.length(); j++){
                if(result.charAt(j) == ch){
                    found = true;
                    break;
                }
            }
            if(!found){
                result += ch;
            }
        }
        System.out.println("Output: " + result);
    }
}
