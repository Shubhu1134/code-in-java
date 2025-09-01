import java.util.Scanner;
 class Algebra{
    private int a, b;

    public Algebra(int a, int b){
        this.a= a;
        this.b= b;
    }
    public int sum(){
        return a+b;
    }
    public int multi(){
        return a*b;
    }
    public int subst(){
        return a-b;
    }

    public void display(){
        System.out.println(sum());
        System.out.println(multi());
        System.out.println(subst());
    }
    


}

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Algebra obj = new Algebra(a,b);
        obj.sum();
        obj.multi();
        obj.subst();
        obj.display();
    }
}