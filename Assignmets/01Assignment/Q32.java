// Q32 - A square garden of side 150 m has a square pool at the center with side 25 m. Find the area of the garden (excluding pool).
class Test {
    public static void main(String[] args) {
        double gardenSide = 150;
        double poolSide = 25;

        double gardenArea = gardenSide * gardenSide;
        double poolArea = poolSide * poolSide;
        double remainingArea = gardenArea - poolArea;

        System.out.println("Area excluding pool: " + remainingArea + " m²");
    }
}
