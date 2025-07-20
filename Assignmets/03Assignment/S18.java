// 18) 1 2 2 4 8 32 …… n terms

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n terms: ");
        int n = sc.nextInt();
        int a = 1;
        System.out.print(a + " ");
        for(int i = 1; i < n; i++) {
            a = a * i;
            System.out.print(a + " ");
        }
    }
}
