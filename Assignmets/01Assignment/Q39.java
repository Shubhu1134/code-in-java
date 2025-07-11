// Q39 - Find the surface area of a cylinder if its diameter is 12 cm and height is 9 cm.
class Test {
    public static void main(String[] args) {
        double diameter = 12;
        double height = 9;
        double radius = diameter / 2;

        // Surface area = 2πr(h + r)
        double surfaceArea = 2 * Math.PI * radius * (radius + height);

        System.out.println("Radius: " + radius + " cm");
        System.out.println("Surface area: " + surfaceArea + " cm²");
    }
}
