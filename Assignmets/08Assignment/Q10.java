class Rectangle {
    private double length;
    private double width;

    // Setter methods
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate area
    public double getArea() {
        return length * width;
    }

    // Method to display rectangle info
    public void showRectangleInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + getArea());
    }
}

public class Test {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.setLength(10.5);
        obj.setWidth(7.2);

        obj.showRectangleInfo();
    }
}