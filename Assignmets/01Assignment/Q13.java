// 13.Find the length of the other leg of a right triangle whose area is 184 cm² and one leg is 16 cm
class Test {
    public static void main(String[] args) {
        int area = 184;
        int leg1 = 16;

        // Calculate the other leg
        double leg2 = (2 * area) / leg1;

        System.out.println("Given leg: " + leg1 + " cm");
        System.out.println("Other leg: " + leg2 + " cm");
        System.out.println("Area of triangle: " + area + " cm^2");
    }
}
