// The base and height of a triangle are in the ratio 8:5 and its area is 320 m². Find the height and base of the triangle.
// import java.lang.Math;

class Test{
    public static void main (String args[]){

         int area = 320;

        int xSquared = area / 20;
        double x = Math.sqrt(xSquared);  

        double base = 8 * x;
        double height = 5 * x;

        System.out.println("Base: " + base + " m");
        System.out.println("Height: " + height + " m");
    }
}