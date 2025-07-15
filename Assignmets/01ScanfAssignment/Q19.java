// Q19. Cube (7cm) vs Cuboid (7×4×8 cm). Which has more volume?

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        int cubeVolume = 7 * 7 * 7;
        int cuboidVolume = 7 * 4 * 8;

        System.out.println("Cube volume: " + cubeVolume + " cm^3");
        System.out.println("Cuboid volume: " + cuboidVolume + " cm^3");

        if (cubeVolume > cuboidVolume) {
            System.out.println("Cube has more volume.");
        } else {
            System.out.println("Cuboid has more volume.");
        }
    }
}
