// 11) Input name of a person and count how many vowels it contains. Use String class methods.

import java.util.Scanner;

class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of a person: ");
        String name = sc.nextLine();

        int count = 0;
        name = name.toLowerCase();

        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }

        System.out.println("Total vowels: " + count);
    }
}
