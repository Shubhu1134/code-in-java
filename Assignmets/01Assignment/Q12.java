// Find the area of a right-angled triangle whose hypotenuse is 13 cm and one of its sides containing the right angle is 12 cm.
// Also, find the length of the other side.

class Test {
    public static void main (String args []){

        int hypotenuse = 13;
        int side1 = 12;

        double side2 = Math.sqrt(hypotenuse * hypotenuse - side1 * side1) ;
        double area = 0.5f * side1 * side2;


        System.out.println("Given side: " + side1 + " cm");
        System.out.println("Other side: " + side2 + " cm");
        System.out.println("Area of triangle: " + area + " cm^2");



    }
}