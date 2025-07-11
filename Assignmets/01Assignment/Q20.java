/*20.What is the volume of a brick of ice-cream with
length = 25 cm, breadth = 10 cm, and height = 8 cm?
 */

// Calculate the volume of an ice-cream brick (cuboid) with given dimensions
class Test {
    public static void main(String[] args) {
        int length = 25;
        int breadth = 10;
        int height = 8;

        int volume = length * breadth * height;

        System.out.println("Length: " + length + " cm");
        System.out.println("Breadth: " + breadth + " cm");
        System.out.println("Height: " + height + " cm");
        System.out.println("Volume of ice-cream brick: " + volume + " cm^3");
    }
}
