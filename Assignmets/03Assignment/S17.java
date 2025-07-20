// 17) 1 2 4 7 11 16 …… n terms

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n terms: ");
        int n = sc.nextInt();
        int num = 1, diff = 1;
        for(int i = 0; i < n; i++) {
            System.out.print(num + " ");
            diff++;
            num += diff;
        }
    }
}
