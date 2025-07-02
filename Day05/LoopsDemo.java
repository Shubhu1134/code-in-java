public class LoopsDemo {
    public static void main(String[] args) {
        // 1. FOR loop: Print 1 to 5
        System.out.println("FOR loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // 2. WHILE loop: Print 5 to 1
        System.out.println("\nWHILE loop:");
        int j = 5;
        while (j >= 1) {
            System.out.println("Count: " + j);
            j--;
        }

        // 3. DO-WHILE loop: Always runs at least once
        System.out.println("\nDO-WHILE loop:");
        int k = 1;
        do {
            System.out.println("Run at least once even if condition false");
        } while (k < 0);

        // 4. Sum of first 10 natural numbers using loop
        System.out.println("\nSum of first 10 numbers:");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);

        // 5. Infinite loop example (commented for safety)
        /*
        while(true) {
            System.out.println("Infinite loop");
        }
        */
    }
}
