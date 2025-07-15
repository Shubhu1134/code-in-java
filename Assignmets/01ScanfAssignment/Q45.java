// Q45. Find sum of first 28 terms of A.P.: -21, -18, -15, ...

class Test {
    public static void main(String args[]) {
        int a = -21;
        int d = 3;
        int n = 28;

        int sum = (n * (2 * a + (n - 1) * d)) / 2;

        System.out.println("Sum of 28 terms: " + sum);
    }
}
