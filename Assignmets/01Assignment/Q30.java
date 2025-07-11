// Q30 - How many tiles of 5 cm × 8 cm are needed to tile a floor of 200 cm × 400 cm?
class Test {
    public static void main(String[] args) {
        double tileLength = 5;
        double tileBreadth = 8;
        double floorLength = 200;
        double floorBreadth = 400;

        double tileArea = tileLength * tileBreadth;
        double floorArea = floorLength * floorBreadth;

        int tileCount = (int)Math.ceil(floorArea / tileArea);

        System.out.println("Total tiles needed: " + tileCount);
    }
}
