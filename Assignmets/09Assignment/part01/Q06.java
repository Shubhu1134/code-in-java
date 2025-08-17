import java.util.Scanner;

class PalindromeChecker{
    static boolean isPalindrome(char arr[], int start, int end){
        while (start <end){
            if (arr[start]!= arr[end]){
                return false;
             
            }
               
            start ++;
            end--;
        }
           
        return true;
   
    }
}
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

     System.out.println("enter something ");
        String str = sc.nextLine();
            
        char arr []= str.toCharArray();
        for (int i= 0; i<arr.length; i++){
            for (int j= i; j<arr.length; j++){
                if (PalindromeChecker.isPalindrome(arr, i , j)){
                    for (int k=i; k<=j; k++){
                    System.out.print(arr[k]);
                }
                System.out.print();
            }
            }
        }
    }
}