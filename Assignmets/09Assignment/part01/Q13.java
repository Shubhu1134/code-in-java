// 13) WAP check if two Strings are anagrams of each other
// Example: LISTEN - SILENT, TRIANGLE - INTEGRAL

import java.util.*;

class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();

        // Remove spaces and convert to lower case for fairness
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if(str1.length() != str2.length()){
            System.out.println("Not Anagrams");
            return;
        }

        // Convert to char array
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
