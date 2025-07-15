// Q38. Volume = 1287 cm³, radius = 10 cm. Find surface area.

class Test {
    public static void main(String args[]) {
        double r = 10;
        double volume = 1287;

        double h = volume / (Math.PI * r * r);
        double area = 2 * Math.PI * r * (r + h);

        System.out.println("Surface area: " + area + " cm^2");
    }
}
