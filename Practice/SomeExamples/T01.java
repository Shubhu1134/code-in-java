import java.util.Scanner;

// Class that represents Number operations
class NumberPrinter {
    private int N;  // data (property)

    // constructor to initialize
    NumberPrinter(int n) {
        this.N = n;
    }

    // behavior (method)
    void printEvenNumbers() {
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        // create object
        NumberPrinter np = new NumberPrinter(n);

        // call method
        np.printEvenNumbers();
    }
}
