/*
Q62. Print the following increasing odd number sequence triangle
1
123
12345
1234567
123456789
*/
class Test {
    public static void main(String[] args) {
        int n=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=2*i-1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
