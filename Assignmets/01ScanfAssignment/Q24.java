// Q24. Bricks 25×10×7.5 cm. Wall 20×2×0.75 m. Cost Rs. 900 per 1000 bricks.

class Test {
    public static void main(String args[]) {
        double brickVol = 25 * 10 * 7.5;
        double wallVol = 2000 * 100 * 75; // in cm³

        int bricks = (int)(wallVol / brickVol);
        double cost = (bricks / 1000.0) * 900;

        System.out.println("Bricks needed: " + bricks);
        System.out.println("Cost: Rs. " + cost);
    }
}
