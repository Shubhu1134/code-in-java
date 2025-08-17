/*
Q72. Print inverted alphabet triangle with spaces
A B C D E
A B C D
A B C
A B
A
*/
class Test {
    public static void main(String[] args) {
        for(int i = 5; i >= 1; i--){
            for(int j = 0; j < i; j++){
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }
    }
}
