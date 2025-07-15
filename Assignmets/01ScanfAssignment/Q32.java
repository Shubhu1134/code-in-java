// Q32. Square garden 150 m side, pool inside 25 m side. Find area of garden.

class Test {
    public static void main(String args[]) {
        int garden = 150 * 150;
        int pool = 25 * 25;
        int area = garden - pool;

        System.out.println("Usable garden area: " + area + " m^2");
    }
}
