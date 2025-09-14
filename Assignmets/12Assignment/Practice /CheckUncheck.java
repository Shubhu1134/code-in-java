// class MyException extends Exception {
//     MyException(String msg) {
//         // no super(msg)
//     }
// }

//  class Test {
//     public static void main(String[] args) {
//         try {
//             throw new MyException("Lost message!");
//         } catch (MyException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// Case 1: Checked
class AgeException1 extends Exception { }

// Case 2: Unchecked
class AgeException2 extends RuntimeException { }

public class Test3 {
    public static void main(String[] args) {
        // 1. Checked Exception
        // throw new AgeException1();  // kya ye compile hoga?

        // 2. Unchecked Exception
        throw new AgeException2();     // kya ye compile hoga?
    }
}
