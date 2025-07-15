// Q34. Trapezoid: bases 128, 92 m; height 40 m. Add 4 m walkway. Find area.

class Test {
    public static void main(String args[]) {
        int base1 = 128;
        int base2 = 92;
        int height = 40;

        double trapezoidArea = 0.5 * (base1 + base2) * height;
        int walkway = 4 * (base1 + base2);
        double total = trapezoidArea + walkway;

        System.out.println("Total area: " + total + " m^2");
    }
}
