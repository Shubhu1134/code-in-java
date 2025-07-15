// Q26. Lay path 120 m × 2.4 m with bricks 24×15 cm. Find number of bricks.

class Test {
    public static void main(String args[]) {
        double pathArea = 120 * 2.4 * 10000; // m² to cm²
        double brickArea = 24 * 15;

        int bricks = (int)(pathArea / brickArea);

        System.out.println("Bricks needed: " + bricks);
    }
}
