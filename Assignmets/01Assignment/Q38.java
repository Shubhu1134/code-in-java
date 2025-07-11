// Q38 - The cylinder has a volume of 1287 cm³ and base radius 10 cm. Find the surface area of the cylinder.
class Test {
    public static void main(String[] args) {
        double volume = 1287;
        double radius = 10;

        // Volume = πr²h → h = volume / (πr²)
        double height = volume / (Math.PI * radius * radius);

        // Surface area = 2πr(h + r)
        double surfaceArea = 2 * Math.PI * radius * (height + radius);

        System.out.println("Height: " + height + " cm");
        System.out.println("Surface area: " + surfaceArea + " cm²");
    }
}
