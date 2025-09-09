// 4. NullPointerException

// 👉 Declare a String = null. Try to call length() on it. Handle the exception.

// // Expected
// java.lang.NullPointerException caught

class Test {
    public static void main(String args []){
        String str = null;

        try{
            System.out.println("length of string :"+ str.length());
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        finally{
            System.out.println(" end........");
        }
    }
}