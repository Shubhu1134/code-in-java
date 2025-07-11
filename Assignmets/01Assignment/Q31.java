// Q31 - What will be the area of a square with perimeter 200 m?
class Test {
    public static void main(String[] args) {
        double perimeter = 200;
        double side = perimeter / 4;
        double area = side * side;

        System.out.println("Side length: " + side + " m");
        System.out.println("Area: " + area + " m²");
    }
}
