// Find cost of polishing the base of a cone using slant height and height
class Test {
    public static void main(String[] args) {
        double height = 4;
        double slantHeight = 5;
        double rate = 10; // Rs per sq. cm

        double radius = Math.sqrt(slantHeight * slantHeight - height * height);
        double area = Math.PI * radius * radius;
        double cost = area * rate;

        System.out.println("Radius of base: " + radius + " cm");
        System.out.println("Base area: " + area + " cm²");
        System.out.println("Cost of polishing: ₹" + cost);
    }
}
