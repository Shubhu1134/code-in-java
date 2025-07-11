// Q35 - Find the surface area of the cylindrical solid whose radius is 7.7 cm and height is 12 cm.
class Test {
    public static void main(String[] args) {
        double radius = 7.7;
        double height = 12;

        // Surface area = 2πr(h + r)
        double surfaceArea = 2 * Math.PI * radius * (radius + height);

        System.out.println("Surface area of cylinder: " + surfaceArea + " cm²");
    }
}
