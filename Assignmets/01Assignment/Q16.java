/*
   16. Tina wants a new carpet for her rectangular dining room.
    Her dining room is a 5 meters by 7 meters rectangle.
    How much carpet does she need to buy to cover her entire dining room?

*/ 

// Find the amount of carpet needed for a rectangular room of size 5 m by 7 m
class Test {
    public static void main(String[] args) {
        int length = 5;
        int breadth = 7;

        int area = length * breadth;

        System.out.println("Length of room: " + length + " m");
        System.out.println("Breadth of room: " + breadth + " m");
        System.out.println("Carpet needed: " + area + " m^2");
    }
}
