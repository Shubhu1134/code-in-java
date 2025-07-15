// Q41. Volume of cylinder: height = 50 cm, diameter = 30 cm

class Test {
    public static void main(String args[]) {
        double d = 30;
        double h = 50;
        double r = d / 2;

        double volume = Math.PI * r * r * h;

        System.out.println("Volume: " + volume + " cm^3");
    }
}
