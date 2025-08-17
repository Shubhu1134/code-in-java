/*
Q48. Print the following pattern
A
AB
A_C
A__D
ABCDE
*/
class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                System.out.println("A");
            } else if (i == 2) {
                System.out.println("AB");
            } else if (i == 5) {
                System.out.println("ABCDE");
            } else {
                System.out.print("A");
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print("_");
                }
                System.out.println((char)('A' + i - 1));
            }
        }
    }
}
