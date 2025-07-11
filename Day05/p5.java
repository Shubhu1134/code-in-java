class TestMain {
    public static void main (String args[]){
        byte a,b,c;
        a = 20;
        b = 10;
        c = (byte)(a+b) ;
        
        System.out.println(c);

        /*
        c = a+b
        c = 20 + 10 
        c = 30 [int ]
        ----------------------------------------------------------------------------------------
        byte variable heps to save memory in java 
        int --->4 byte ==>32 bit
                1 byte ==> 8 bit 
        ----------------------------------------------------------------------------------------
        p5.java:6: error: incompatible types: possible lossy conversion from int to byte
        c = a+b ;
             ^1 error

             because java does not allows data loss 
        -----------------------------------------------------------------------------------------
        solution ==> type casting 

        c = (byte)(a+b)
        
        */
       
    }
}