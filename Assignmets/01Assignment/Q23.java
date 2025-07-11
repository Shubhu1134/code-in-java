/*23. Find the number of cubical boxes of cubical side 3 cm 
which can be accommodated in carton of dimensions 15 cm × 9 cm × 12 cm.
 */

class Test {
    public static void main(String[] args) {
        int cubeA = 3;
        int length= 15;
        int breadth = 9;
        int height = 12;
          
        double cubicalVol = Math.pow(cubeA , 3);
        double cuboidVol = length * breadth * height;

        double noOfCubicalBox = cuboidVol / cubicalVol ;

       
        System.out.println("vol of cubical box :"+ cubicalVol +"cm^3");
        System.out.println("vol of cuboidal  cartoon :"+ cuboidVol);
        System.out.println("no. of cubical box :"+noOfCubicalBox);
    }
}
