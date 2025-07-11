/*25. 100 bricks of length 24 cm and 
      breadth 15 cm are used to tile a path of a garden.
      What is the area of the path?
*/ 

class Test{
    public static void main(String args []){
        int l = 24; 
        int b = 15; 
        int noOfbrick = 100;

        int totalarea = l * b * 100 ; 

        System.out.println("total area covered by bricks :"+ totalarea + "cm^2");

    }
}