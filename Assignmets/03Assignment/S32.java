// 32) A	b	C	d	E	f	G	h	…… n terms 

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();

        char upper = 'A';
        char lower = 'b';
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(upper + " ");
                upper += 2;
            } else {
                System.out.print(lower + " ");
                lower += 2;
            }
        }
    }
}
