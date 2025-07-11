//1. The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area.
class Test{
    public static void main (String args[]){
        int perimeter =230 ;
        int length = 70 ; 

        int bredth = (perimeter /2 ) - length ;
        int area = length * bredth;

        System.out.println("Length: " + length + " cm");
        System.out.println("Breadth: " + bredth + " cm");
        System.out.println("Area: " + area + " cm^2");
    }   
}
