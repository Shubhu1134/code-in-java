// 8. Write a Java program to create class called "TrafficLight"
// with attributes for color and duration, and methods to change
// the color and check for red or green.

class TrafficLight {
    private String color;
    private int duration; // in seconds

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }
    public TrafficLight() {}

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }

    public void changeColor(String newColor, int newDuration) {
        color = newColor;
        duration = newDuration;
        System.out.println("Traffic light changed to " + color + " for " + duration + " seconds.");
    }

    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Duration: " + duration + " seconds");
    }
}

class TestMain {
    public static void main(String args[]) {
        TrafficLight light1 = new TrafficLight("Red", 30);
        TrafficLight light2 = new TrafficLight("Green", 45);

        System.out.println("Light 1:");
        light1.display();

        System.out.println("\nLight 2:");
        light2.display();

        System.out.println("\nChecking colors:");
        System.out.println("Light 1 is red? " + light1.isRed());
        System.out.println("Light 2 is green? " + light2.isGreen());

        light1.changeColor("Green", 40);
        light1.display();
    }
}
