//15. Shelly has a rectangular garden of length 22 m and breadth 15 m.
// Rachel has a square garden of side 21 m.
// Whose garden is bigger and by how much?

// Compare area of Shelly's rectangular garden and Rachel's square garden
class Test {
    public static void main(String[] args) {
        int shellyLength = 22;
        int shellyBreadth = 15;
        int rachelSide = 21;

        int shellyArea = shellyLength * shellyBreadth;
        int rachelArea = rachelSide * rachelSide;

        System.out.println("Shelly's garden area: " + shellyArea + " m^2");
        System.out.println("Rachel's garden area: " + rachelArea + " m^2");

        if (shellyArea > rachelArea) {
            System.out.println("Shelly has the bigger garden by " + (shellyArea - rachelArea) + " m^2");
        } else if (rachelArea > shellyArea) {
            System.out.println("Rachel has the bigger garden by " + (rachelArea - shellyArea) + " m^2");
        } else {
            System.out.println("Both gardens are of equal area.");
        }
    }
}
