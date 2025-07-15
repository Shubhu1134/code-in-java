// Q29. Tiles of 10×10 cm to tile 800×900 cm floor. Find number of tiles.

class Test {
    public static void main(String args[]) {
        int floorArea = 800 * 900;
        int tileArea = 10 * 10;

        int tiles = floorArea / tileArea;

        System.out.println("Tiles needed: " + tiles);
    }
}
