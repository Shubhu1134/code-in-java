// Q36. Surface area of cylinder: diameter 15 m, height 7 m

class Test {
    public static void main(String args[]) {
        double d = 15;
        double r = d / 2;
        double h = 7;

        double area = 2 * Math.PI * r * (r + h);

        System.out.println("Surface area: " + area + " m^2");
    }
}
