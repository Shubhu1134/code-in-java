// 16) …... -6 -3 0 3 6 9 ……. n terms

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n terms: ");
        int n = sc.nextInt();
        int start = -6;
        for(int i = 0; i < n; i++) {
            System.out.print(start + " ");
            start += 3;
        }
    }
}
