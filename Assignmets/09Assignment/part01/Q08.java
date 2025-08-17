// 8) WAP to find out total occurrence of each letter in string.
// Sample Input: “aabbccddd”
// Output:   a- 2 times
//           b- 2 times
//           c- 2 times
//           d- 3 times

import java.util.Scanner;

class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int count = 0;
            boolean alreadyCounted = false;

            for(int k=0; k<i; k++){
                if(str.charAt(k) == ch){
                    alreadyCounted = true;
                    break;
                }
            }

            if(!alreadyCounted){
                for(int j=0; j<str.length(); j++){
                    if(str.charAt(j) == ch){
                        count++;
                    }
                }
                System.out.println(ch + "- " + count + " times");
            }
        }
    }
}
