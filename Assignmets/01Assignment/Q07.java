//     Find the height of a triangle whose base is 50 cm and whose area is 500 cm².

class Test {
    public static void main (String args []){
        int base = 50;   
        int area = 500;

        int height = (2 * area) / base;

        System.out.println("Base: " + base + " cm");
        System.out.println("Area: " + area + " cm^2");
        System.out.println("Height of triangle: " + height + " cm");
    }
}