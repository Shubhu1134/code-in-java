// 1. Write a Java program to create a class called "Person" 
// with a name and age attribute. Create two instances of 
// the "Person" class, set their attributes using the constructor, and print their name and age.


class Person{
    private String name ; 
    private int age ; 


    Person(String name , int age){
        this.name= name ; 
        this.age= age ;
    }
    public void display(){
        System.out.println( " name "+ name +" age "+age );
    }
}
class Test{ 
    public static void main(String args[]){
        Person p = new Person(" shubham ",23 );
        p.display();
    }
}






// class Person{
//     private int age; 
//     private String name ; 

//     public Person(String name , int age ){
//         this.name = name; 
//         this.age= age; 

//     }
//     public Person(){}

      
//     public void display(){
//         System.out.println("name :"+ name +  " age : "+ age );

//     }

// }
// class TestMain{
//     public static void main (String args[]){
//         Person p1 = new Person (" shubham ", 21 );
//         Person p2 = new Person ( " rahul ", 22); 


//         p1.display();
//         p2.display();
//     }
// }

