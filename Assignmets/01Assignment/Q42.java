// Find the volume of a cylinder given diameter and height
class Test {
    public static void main(String[] args) {
        double diameter = 2.25;
        double height = 2.25;
        double radius = diameter / 2;

        double volume = Math.PI * radius * radius * height;

        System.out.println("Radius: " + radius + " cm");
        System.out.println("Volume of cylinder: " + volume + " cm³");
    }
}
