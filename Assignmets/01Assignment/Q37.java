// Q37 - The surface area of the cylinder is 149 cm² and height is 6 cm. Find the diameter of the cylinder.
class Test {
    public static void main(String[] args) {
        double surfaceArea = 149;
        double height = 6;

        // Surface area = 2πr(h + r) → solve for r using quadratic formula
        // 2πr(h + r) = SA → πr² + πrh - SA/2 = 0

        // Rearranged: r² + hr - SA/(2π) = 0
        double a = 1;
        double b = height;
        double c = -surfaceArea / (2 * Math.PI);

        double discriminant = Math.sqrt(b * b - 4 * a * c);
        double r = (-b + discriminant) / (2 * a);
        double diameter = 2 * r;

        System.out.println("Radius: " + r + " cm");
        System.out.println("Diameter: " + diameter + " cm");
    }
}
