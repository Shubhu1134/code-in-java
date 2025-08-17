/*
Q69. Print inverted star triangle
*********
*******
*****
***
*
*/
class Test {
    public static void main(String[] args) {
        int stars = 9;
        for(int i = 0; i < 5; i++){
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
            stars -= 2;
        }
    }
}
