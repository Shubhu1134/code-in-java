// Q03. Print the following pattern:
// *
//   *
//     *
//       *
//         *



 class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // print i spaces
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
    }
}

