// 16. Write a Java program to create a class called "Shape"
// with abstract methods for calculating area and perimeter,
// and subclasses for "Rectangle", "Circle", and "Triangle".

abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void display();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public void display() {
        System.out.println("Rectangle - Area: " + getArea() + ", Perimeter: " + getPerimeter());
    }
}

class CircleShape extends Shape {
    private double radius;

    public CircleShape(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public void display() {
        System.out.println("Circle - Area: " + getArea() + ", Perimeter: " + getPerimeter());
    }
}

class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public double getPerimeter() {
        return a + b + c;
    }
    public void display() {
        System.out.println("Triangle - Area: " + getArea() + ", Perimeter: " + getPerimeter());
    }
}

class TestMain {
    public static void main(String args[]) {
        Shape r = new Rectangle(5, 7);
        Shape c = new CircleShape(4);
        Shape t = new Triangle(3, 4, 5);
        r.display();
        c.display();
        t.display();
    }
}
