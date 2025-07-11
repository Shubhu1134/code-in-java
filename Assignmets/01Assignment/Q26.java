/* 26. How many bricks will be required to 
lay a path 120 m long and 2.4 m breadth 
if a brick is 24 cm long and 15 cm wide?
*/ 
class Test {
    public static void main(String args[]){
      double  pathlength = 12000 ;
      double  pathbreadth = 240;
      double  bricklength = 24;
      double  brickbridth = 15;


      double patharea = pathlength * pathbreadth;
      double brickarea = bricklength * brickbridth;

      double noOfbrick = patharea/brickarea;

      System.out.println ("no of brick lay at total area of path : " + noOfbrick);
    }

    }