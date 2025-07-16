// 25. Calculate profit or loss

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        int cp = sc.nextInt();
        System.out.print("Enter selling price: ");
        int sp = sc.nextInt();

        if (sp > cp)
            System.out.println("Profit: " + (sp - cp));
        else if (cp > sp)
            System.out.println("Loss: " + (cp - sp));
        else
            System.out.println("No profit no loss");
    }
}
