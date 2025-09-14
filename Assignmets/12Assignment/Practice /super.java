class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}

public class Test1{
    public static void main(String args[]){
     

     try{
        throw new MyException("lost message ");
     }
     catch(MyException e){
        System.out.println(e.getmessage());
     }
    }
}