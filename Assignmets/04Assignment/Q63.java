/*
Q63. Print the following alphabet sequence triangle
A
ABC
ABCDE
ABCDEEF
ABCDEFGHI
*/
class Test {
    public static void main(String[] args) {
        char ch='A';
        int length = 1;
        for(int i=1;i<=6;i++){
            for(int j=1;j<=length;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            length += 2;
        }
    }
}
