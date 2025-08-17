/*
Q61. Print the following increasing odd number triangle
*
***
*****
*******
*********
*/
class Test {
    public static void main(String[] args) {
        int stars = 1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            stars += 2;
        }
    }
}
