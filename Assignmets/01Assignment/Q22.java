/* 22. A pond is 50 m long, 30 m wide, and 2 m deep.
Find the capacity of the pond in cubic metres.
 */
// Calculate the capacity of a pond with dimensions 50 m × 30 m × 2 m
class Test {
    public static void main(String[] args) {
        int length = 50;
        int breadth = 30;
        int depth = 2;

        int capacity = length * breadth * depth;

        System.out.println("Length: " + length + " m");
        System.out.println("Breadth: " + breadth + " m");
        System.out.println("Depth: " + depth + " m");
        System.out.println("Capacity of pond: " + capacity + " m^3");
    }
}
