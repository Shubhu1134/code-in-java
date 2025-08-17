/*
Q52. Print the following mixed number hollow triangle
12345
1__4
1_3
12
1
*/
class Test {
    public static void main(String[] args) {
        for(int i = 5; i >= 1; i--){
            if(i == 5){
                for(int j = 1; j <= i; j++){
                    System.out.print(j);
                }
            } else if(i == 4){
                System.out.print("1__4");
            } else if(i == 3){
                System.out.print("1_3");
            } else if(i == 2){
                System.out.print("12");
            } else {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
