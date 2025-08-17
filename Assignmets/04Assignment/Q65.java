/*
Q65. Print Pascal's triangle first 5 rows
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
*/
class Test {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
