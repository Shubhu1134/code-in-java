// Q36 - What is the surface area of a cylinder if the diameter is 15 m and height is 7 m?
class Test {
    public static void main(String[] args) {
        double diameter = 15;
        double height = 7;
        double radius = diameter / 2;

        // Surface area = 2πr(h + r)
        double surfaceArea = 2 * Math.PI * radius * (radius + height);

        System.out.println("Radius: " + radius + " m");
        System.out.println("Surface area: " + surfaceArea + " m²");
    }
}
