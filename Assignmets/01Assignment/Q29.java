// Q29 - How many square tiles of side 10 cm are required to tile a floor 800 cm × 900 cm?
class Test {
    public static void main(String[] args) {
        double tileSide = 10;
        double floorLength = 800;
        double floorBreadth = 900;

        double tileArea = tileSide * tileSide;
        double floorArea = floorLength * floorBreadth;

        int tileCount = (int)Math.ceil(floorArea / tileArea);

        System.out.println("Total square tiles needed: " + tileCount);
    }
}
