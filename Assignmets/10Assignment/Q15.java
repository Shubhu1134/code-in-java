class MathOperation {
    int multiply(int a, int b) { return a * b; }
    float multiply(float a, float b, float c) { return a * b * c; }
    int multiply(int[] arr) {
        int prod = 1;
        for (int x : arr) prod *= x;
        return prod;
    }
    double multiply(double a, int b) { return a * b; }
}

public class Test {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        System.out.println(m.multiply(2, 3));
        System.out.println(m.multiply(1.2f, 2.3f, 3.4f));
        System.out.println(m.multiply(new int[]{1, 2, 3, 4}));
        System.out.println(m.multiply(5.5, 2));
    }
}
