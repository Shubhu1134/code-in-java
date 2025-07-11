// How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm? 

class Test {
    public static void main (String args []){
        int tileLength = 13;  
        int tileBreadth = 7;     
        int floorLength = 520;   
        int floorBreadth = 140; 

        int tileArea = tileLength * tileBreadth;
        int floorArea = floorLength * floorBreadth;

        int numberOfTiles = floorArea / tileArea;

        System.out.println("Area of one tile: " + tileArea + " cm^2");
        System.out.println("Area of floor: " + floorArea + " cm^2");
        System.out.println("Number of tiles required: " + numberOfTiles);
         }
}