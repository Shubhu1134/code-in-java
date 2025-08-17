class Test {
    public static void main (String args []){
        static String schoolName = rkspublicSchool; 
        int rollNo = 21;

        static void PrintName(){
            System.out.println("school NAME : "+ schoolName);
            System.out.println(" roll number "+ rollNo);
        }
        void instanceMethod(){
            System.out.println("School name :"+ schoolName);
            System.out.println("roll number :" +rollNo );
        }
    }
}