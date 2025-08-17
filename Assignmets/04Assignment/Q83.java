/*
Q83. Increasing numbers pyramid
1
12
123
1234
123
12
1
*/
class Test {
    public static void main(String[] args) {
        // Increasing
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        // Decreasing
        for(int i=3; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
