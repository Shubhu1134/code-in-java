// Q39. Surface area of cylinder with diameter 12 cm, height 9 cm

class Test {
    public static void main(String args[]) {
        double d = 12;
        double r = d / 2;
        double h = 9;

        double area = 2 * Math.PI * r * (r + h);

        System.out.println("Surface area: " + area + " cm^2");
    }
}
