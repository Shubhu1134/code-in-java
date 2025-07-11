/* 19.A cube with an edge of 7 cm and a cuboid measuring 7 cm × 4 cm × 8 cm are kept on a table.
Which shape has more volume?
 */

// Compare volume of a cube (edge 7 cm) and a cuboid (7 cm × 4 cm × 8 cm)
class Test {
    public static void main(String[] args) {
        int cubeSide = 7;
        int cuboidLength = 7;
        int cuboidBreadth = 4;
        int cuboidHeight = 8;

        double cubeVolume = Math.pow(cubeSide, 3); // side^3
        double cuboidVolume = cuboidLength * cuboidBreadth * cuboidHeight;

        System.out.println("Volume of cube: " + cubeVolume + " cm^3");
        System.out.println("Volume of cuboid: " + cuboidVolume + " cm^3");

        if (cubeVolume > cuboidVolume) {
            System.out.println("Cube has more volume.");
        } else if (cuboidVolume > cubeVolume) {
            System.out.println("Cuboid has more volume.");
        } else {
            System.out.println("Both have equal volume.");
        }
    }
}
