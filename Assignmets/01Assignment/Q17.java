/* 17. Luci is making a display board for the school exhibition.
The display board is a 3 m by 2 m rectangle.
He needs to add a ribbon border around the entire board.
What is the length of ribbon that he needs?

*/

// Find the length of ribbon needed to cover the border of a rectangular board (3 m by 2 m)
class Test {
    public static void main(String[] args) {
        int length = 3;
        int breadth = 2;

        int perimeter = 2 * (length + breadth);

        System.out.println("Length of board: " + length + " m");
        System.out.println("Breadth of board: " + breadth + " m");
        System.out.println("Length of ribbon needed: " + perimeter + " m");
    }
}
