// Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter is 36 cm.class Test {
   class Test{
   
    public static void main (String args []){

        int a = 10;
        int b = 9;
        int perimeter = 36;

        int c = perimeter - a - b;
        int s = perimeter / 2;

        int area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        System.out.println("Sides: " + a + " cm, " + b + " cm, " + c + " cm");
        System.out.println("Semi-perimeter: " + s + " cm");
        System.out.println("Area of triangle: " + area + " cm^2");

    }
   }