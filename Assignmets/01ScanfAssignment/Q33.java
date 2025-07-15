// Q33. Garden 30×20 m. Two paths: width 3 m and 4 m. Find usable area.

class Test {
    public static void main(String args[]) {
        int total = 30 * 20;
        int path1 = 3 * 20;
        int path2 = 4 * 30;
        int overlap = 3 * 4;

        int area = total - (path1 + path2 - overlap);

        System.out.println("Usable area: " + area + " m^2");
    }
}
