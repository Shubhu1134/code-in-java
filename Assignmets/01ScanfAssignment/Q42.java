// Q42. Volume of cylinder: diameter = 2.25 cm, height = 2.25 cm

class Test {
    public static void main(String args[]) {
        double d = 2.25;
        double r = d / 2;
        double h = 2.25;

        double volume = Math.PI * r * r * h;

        System.out.println("Volume: " + volume + " cm^3");
    }
}
