class Circle {
    private double radius;

    // Setter method
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display circle properties
    public void showCircleInfo() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }
}

public class Test {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.setRadius(7.5);

        obj.showCircleInfo();
    }
}