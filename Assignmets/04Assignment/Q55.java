/*
Q55. Print the following inverted alphabet triangle
ABCDE
ABCD
ABC
AB
A
*/
class Test {
    public static void main(String[] args) {
        for(int i = 5; i >= 1; i--){
            for(int j = 0; j < i; j++){
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
    }
}
