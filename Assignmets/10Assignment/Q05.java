// 5) Create an Object having two properties and four behaviours
// (add,substract,multiply,divide) to perform desired operation.
// object must have setter and getter and keep all properties private.

import java.util.Scanner;
class Calculator{
    private int a, b;

    public Calculator(int a, int b){
        this.a =a; 
        this.b = b;
    }


     public int getA(){
        return a;
    }
     public int getB(){
        return b;
    }
    public int add(){
        return a+b;
    }
    public int substract(){
        return a-b;
    }
    public int multiply(){
        return a*b;
    }
    public int divide(){
        return a/b;
    }
    public void setData(int a , int b){
        this.a = a ;
        this.b= b;
    }
    public void dispaly(){
     System.out.println(add());
     System.out.println(substract());
     System.out.println(multiply());
     System.out.println(divide());
     System.out.println(getA());
     System.out.println(getB());
    }

}

class Test{
    public static void main(String args[]){
    
    Calculator clct = new Calculator(8, 2);
    
    clct.add();
    clct.substract();
    clct.multiply();
    clct.divide();
    clct.getA();
    clct.getB();
    clct.dispaly();

    clct.setData(45,5);

       clct.add();
    clct.substract();
    clct.multiply();
    clct.divide();
    clct.getA();
    clct.getB();
    clct.dispaly();

    }
}