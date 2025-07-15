// Q15
// Q15. Garden 1: 22×15 m, Garden 2: 21×21 m. Whose garden is bigger and by how much?

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        int area1 = 22 * 15;
        int area2 = 21 * 21;

        System.out.println("Shelly's garden area: " + area1);
        System.out.println("Rachel's garden area: " + area2);

        if (area1 > area2) {
            System.out.println("Shelly's garden is bigger by " + (area1 - area2) + " m^2");
        } else {
            System.out.println("Rachel's garden is bigger by " + (area2 - area1) + " m^2");
        }
    }
}
