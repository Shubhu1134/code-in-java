/* 21 .A brick measures 15 cm × 8 cm × 5 cm.
How many bricks will be used to build a wall of length 15 m, breadth 10 m and height 8 m?
 */
// Calculate how many 15 cm × 8 cm × 5 cm bricks are needed
// to build a wall 15 m × 10 m × 8 m.
class Test {
    public static void main(String[] args) {

        // Brick dimensions in metres
        double brickLength = 0.15;
        double brickBreadth = 0.08;
        double brickHeight  = 0.05;

        // Wall dimensions in metres
        double wallLength  = 15;
        double wallBreadth = 10;
        double wallHeight  = 8;

        // Volumes
        double brickVolume = brickLength * brickBreadth * brickHeight; // m^3
        double wallVolume  = wallLength  * wallBreadth  * wallHeight;  // m^3

        // Number of bricks
        long numberOfBricks = Math.round(wallVolume / brickVolume);    // nearest whole brick

        System.out.println("Brick volume: " + brickVolume + " m^3");
        System.out.println("Wall volume: " + wallVolume + " m^3");
        System.out.println("Number of bricks required: " + numberOfBricks);
    }
}
