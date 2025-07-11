// Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m.

class Test {
    public static void main (String args []){

         double length = 300;
        double breadth = 150; 
        double rate = 6; // $ per 100 square meter

        double area = length * breadth;

        double cost = (area / 100) * rate ;

        System.out.println("Area of land: " + area + " m^2");
        System.out.println("Total cost of tiling: $" + cost);
    }
}