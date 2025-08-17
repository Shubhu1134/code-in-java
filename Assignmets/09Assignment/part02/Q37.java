// 37. Write a Java program to check if the letter 'x' is present in the word 'String Exercises'

class Test {
    public static void main(String args[]) {
        String str = "String Exercises";
        if(str.contains("x")){
            System.out.println("'x' is present");
        } else {
            System.out.println("'x' is not present");
        }
    }
}
