// 4. Write a Java program to create a class called "Circle"
// with a radius attribute. You can access and modify this attribute.
// Calculate the area and circumference of the circle.

class Circle{
    private double radius; 

    public Circle (double radius){
        this.radius = radius; 
    }
    public Circle(){}

    public void setRadius(double radius){
        this.radius= radius; 
    }
    public double getRadius(){
        return radius; 
    }
    public double getCircumference(){
        return 2* Math.PI * radius; 

    }
    public double getArea(){
        return Math.PI* radius* radius; 
    }

    public void display(){ 
        System.out.println(" Radius :"+ radius ); 
        System .out.println(" Area :"+ getArea()); 
        System.out.println("Circumference : "+ getCircumference());
    }
}
class TestMain{
    public static void main (String args[]){
        Circle c1 = new Circle(5); 
        Circle c2 = new Circle( 7); 

        System.out.println("Circle 1"); 
        c1.display(); 

         System.out.println("Circle 2"); 
        c2.display(); 

        c1.setRadius(10);
        System.out.println("\n After modification radius of circle 1 :");
        c1.display();
    }
}