/*
Q59. Print the following alphabet triangle
A
A B
A B C
A B C D
A B C D E
*/
class Test {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)('A'+j) + " ");
            }
            System.out.println();
        }
    }
}
