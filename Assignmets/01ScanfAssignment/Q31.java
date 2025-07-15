// Q31. What will be the area of a square with perimeter 200 m?

class Test {
    public static void main(String args[]) {
        int perimeter = 200;
        int side = perimeter / 4;
        int area = side * side;

        System.out.println("Area: " + area + " m^2");
    }
}
