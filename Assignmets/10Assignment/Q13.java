import java.util.*;

class Circle {
    private double radius, area;
    Scanner sc = new Scanner(System.in);

    void init() {
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
    }
    void calc() { area = Math.PI * radius * radius; }
    void display() { System.out.println("Area of circle = " + area); }
}

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.init(); c.calc(); c.display();
    }
}
