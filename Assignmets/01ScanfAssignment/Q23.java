// Q23. Cubical box side 3 cm. Carton size 15×9×12 cm. How many boxes?

class Test {
    public static void main(String args[]) {
        int cubeVol = 3 * 3 * 3;
        int cartonVol = 15 * 9 * 12;

        int boxes = cartonVol / cubeVol;

        System.out.println("Boxes: " + boxes);
    }
}
