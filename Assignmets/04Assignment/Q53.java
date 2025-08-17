/*
Q53. Print the following mixed number hollow triangle
55555
4__4
3_3
22
1
*/
class Test {
    public static void main(String[] args) {
        for(int i = 5; i >= 1; i--){
            if(i == 5){
                System.out.println("55555");
            } else if(i == 4){
                System.out.println("4__4");
            } else if(i == 3){
                System.out.println("3_3");
            } else if(i == 2){
                System.out.println("22");
            } else {
                System.out.println("1");
            }
        }
    }
}
