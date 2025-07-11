// Q34 - A wooded area is a trapezoid with bases 128 m and 92 m, height 40 m. A 4 m wide walkway is added perpendicular to bases.
// Find area after addition.
class Test {
    public static void main(String[] args) {
        double base1 = 128;
        double base2 = 92;
        double height = 40;
        double walkwayArea = 4 * (base1 + base2) / 2; // if perpendicular, assume width × avg base

        double trapezoidArea = 0.5 * (base1 + base2) * height;
        double totalArea = trapezoidArea + walkwayArea;

        System.out.println("Original trapezoid area: " + trapezoidArea + " m²");
        System.out.println("Total area after walkway: " + totalArea + " m²");
    }
}
