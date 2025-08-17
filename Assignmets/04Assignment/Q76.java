/*
Q76. Print decreasing and increasing x pattern
x
xx
xxx
xxxx
xxx
xx
x
*/
class Test {
    public static void main(String[] args) {
        // Increasing
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("x");
            }
            System.out.println();
        }
        // Decreasing
        for(int i = 3; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
