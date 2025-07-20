// 59) WAP to find out the sum of all integers between 100 and 200 which are divisible by 9

class Test {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of numbers divisible by 9 between 100 and 200 is: " + sum);
    }
}
