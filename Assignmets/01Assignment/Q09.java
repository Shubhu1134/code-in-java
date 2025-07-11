//Find the area of an equilateral triangle, the length of whose sides is 12 cm.
class Test{
    public static void main (String args[]){

    int side = 12;
    int area = (Math.sqrt(3) / 4) * side * side;

    System.out.println("Side length: " + side + " cm");
    System.out.println("Area of equilateral triangle: " + area + " cm^2");

    }
}