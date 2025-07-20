// 31) 9 99 999 9999 99999 …….

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();
        int num = 9;
        for (int i = 1; i <= n; i++) {
            System.out.print(num + " ");
            num = num * 10 + 9;
        }
    }
}
