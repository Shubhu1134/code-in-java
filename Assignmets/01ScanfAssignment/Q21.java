// Q21. A brick measures 15×8×5 cm. Wall size is 15×10×8 m. How many bricks needed?

class Test {
    public static void main(String args[]) {
        int brickVol = 15 * 8 * 5; // in cm³
        int wallVol = 1500 * 100 * 800; // convert m³ to cm³

        int bricks = wallVol / brickVol;

        System.out.println("Number of bricks: " + bricks);
    }
}
