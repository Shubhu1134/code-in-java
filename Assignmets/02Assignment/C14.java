// 14. WAP to find lowest number among four different numbers

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        System.out.print("Enter 4 numbers: ");
        for (int i = 0; i < 4; i++)
            nums[i] = sc.nextInt();

        int min = nums[0];
        for (int i = 1; i < 4; i++)
            if (nums[i] < min)
                min = nums[i];

        System.out.println("Lowest number is: " + min);
    }
}
