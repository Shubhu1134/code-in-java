
// Q03. How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm?

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        int tileLength = 13;
        int tileBreadth = 7;
        int areaTile = tileLength * tileBreadth;

        int floorLength = 520;
        int floorBreadth = 140;
        int areaFloor = floorLength * floorBreadth;

        int numberOfTiles = areaFloor / areaTile;

        System.out.println("Tiles needed: " + numberOfTiles);
    }
}
