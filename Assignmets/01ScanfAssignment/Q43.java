// Q43. Cone: height = 4 cm, slant height = 5 cm. Base polish rate = Rs.10 per cm²

class Test {
    public static void main(String args[]) {
        double r = Math.sqrt(5*5 - 4*4);
        double baseArea = Math.PI * r * r;
        double cost = baseArea * 10;

        System.out.println("Cost: Rs. " + cost);
    }
}
