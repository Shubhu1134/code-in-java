// Find the sum of 28 terms of the Arithmetic Progression: -21, -18, -15, -12,...
class Test {
    public static void main(String[] args) {
        int a = -21;      // First term
        int d = 3;        // Common difference
        int n = 28;       // Number of terms

        // Calculate sum using formula: S = n/2 * (2a + (n-1)d)
        int sum = n * (2 * a + (n - 1) * d) / 2;

        System.out.println("Sum of first " + n + " terms: " + sum);
    }
}
