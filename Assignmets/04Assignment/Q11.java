// Q11. Print the following pattern:
// A
// AB
// ABC
// ABCD
// ABCDE

 class Test {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
