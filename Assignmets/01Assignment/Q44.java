// Find the 28th term of the Arithmetic Progression: -21, -18, -15, -12,...
class Test {
    public static void main(String[] args) {
        int a = -21;      // First term
        int d = 3;        // Common difference
        int n = 28;       // Term number

        // Calculate the nth term using formula: Tn = a + (n-1) * d
        int term = a + (n - 1) * d;

        System.out.println("28th term of the AP is: " + term);
    }
}
