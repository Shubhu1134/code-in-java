// 3. Write a Java program to create a class called "Rectangle"
// with width and height attributes. Calculate the area and perimeter
// of the rectangle.

class Rectangle{
    private double width ; 
    private double height; 

public Rectangle(double width, double height ){
    this.width = width ; 
    this.height = height ; 
}
    public Rectangle(){}

    public double getArea(){
        return width *height ;
    }
    public double getPerimeter(){
        return 2*(width + height ); 
    }

    public void display(){
        System.out.println("Width : "+ width + ", Height "+ height ); 
        System.out.println("Area "+ getArea()); 
        System.out.println("Perimeter :"+getPerimeter() ); 
    }
}

class TestMain{
    public static void main(String args[]){
        Rectangle r1 = new Rectangle( 5, 3);
        Rectangle r2 = new Rectangle ( 4, 6); 


        System.out.println("Rerctangle 1 :");
        r1.display();

        System.out.println("\n Rectangle 2 :");
        r2.display();
    }
}
