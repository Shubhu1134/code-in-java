/**24. How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be required for
 *  a wall 20 m long, 2 m high and 0.75 m thick?
 *  If bricks sell at $900 per thousand what will it cost to build the wall? */

class Test {
    public static void main (String args[]){

    int l1 =25 ;
    int l2= 2000;
    int b1 = 10 ;
    int b2= 200;
    double w1 =7.5 ;
    double w3= 75;

    double brickVol = l1 * b1 * w1;
    double wallVol = l2 * b2 * w3;

    double noOfbrick = wallVol / brickVol;
    double cost = (noOfbrick /1000)*900;

    System.out.println("total cost to put the brick in wall :"+ cost +"$");
    System.out.println("no of bricks :"+noOfbrick);
      }

    }