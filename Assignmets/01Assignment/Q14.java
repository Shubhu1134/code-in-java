// 14. The length of one of the diagonals of a field in the form of a quadrilateral is 46 m.
// The perpendicular distances of the other two vertices from the diagonal are 13 m and 10 m.
// Find the area of the field.


// Find the area of a quadrilateral field using its diagonal and perpendicular heights
class Test {
    public static void main(String[] args) {
        int diagonal = 46;     // in meters
        int height1 = 13;      // perpendicular from vertex 1
        int height2 = 10;      // perpendicular from vertex 2

        // Area = sum of areas of 2 triangles
        double area1 = 0.5 * diagonal * height1;
        double area2 = 0.5 * diagonal * height2;
        double totalArea = area1 + area2;

        System.out.println("Area of triangle 1: " + area1 + " m^2");
        System.out.println("Area of triangle 2: " + area2 + " m^2");
        System.out.println("Total area of field: " + totalArea + " m^2");
    }
}
