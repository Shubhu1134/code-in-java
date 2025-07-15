// Q30. Tile 200×400 cm floor using tiles of 5×8 cm. Find number of tiles.

class Test {
    public static void main(String args[]) {
        int floorArea = 200 * 400;
        int tileArea = 5 * 8;

        int tiles = floorArea / tileArea;

        System.out.println("Tiles needed: " + tiles);
    }
}
