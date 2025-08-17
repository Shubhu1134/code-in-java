/*
Q71. Print inverted number triangle
123456789
1234567
12345
123
1
*/
class Test {
    public static void main(String[] args) {
        int n = 9;
        for(int i = n; i >= 1; i -= 2){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
