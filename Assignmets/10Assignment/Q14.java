import java.util.*;

class MathOperation {
    private int X, Y;
    private double R;
    Scanner sc = new Scanner(System.in);

    void init() {
        System.out.print("Enter X and Y: ");
        X = sc.nextInt(); Y = sc.nextInt();
    }
    void add() { R = X + Y; }
    void multiply() { R = X * Y; }
    void power() { R = Math.pow(X, Y); }
    void display() { System.out.println("Result = " + R); }
}

public class Test {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        m.init(); m.add(); m.display();
        m.multiply(); m.display();
        m.power(); m.display();
    }
}
