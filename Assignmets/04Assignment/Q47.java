/*
Q47. Print the following pattern
1
11
1*1
1**1
11111
*/
class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                System.out.println("1");
            } else if (i == 2) {
                System.out.println("11");
            } else if (i == 5) {
                System.out.println("11111");
            } else {
                System.out.print("1");
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print("*");
                }
                System.out.println("1");
            }
        }
    }
}
