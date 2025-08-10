// 2. Write a Java program to create a class called "Dog" 
// with a name and breed attribute. Create two instances of the "Dog" class,
// set their attributes using the constructor and modify the attributes 
// using the setter methods and print the updated values.

class Dog{ 
    private String name ; 
    private String breed; 


 public Dog(String name , String breed ){
    this.name= name ; 
    this.breed = breed; 
 }
 public Dog() {}

 public void setName(String name ){
    this.name = name ; 

 }
 public void setBreed(String breed){
    this.breed = breed; 
 }
 public void display(){
    System.out.println("Name "+ name +", Breed "+breed );
 }
}

class TestMain{
    public static void main(String []args ){
        Dog d1 = new Dog(" humpy ", " golden bulf");
        Dog d2 = new Dog( "Max ", " German shepherd ");

        System.out.println(" Original details "); 
        d1.display(); 
        d2.display();


        d1.setName("charlie");
        d1.setBreed("Bulldog");


        d2.setName("Rocky "); 
        d2.setBreed("Labroder "); 

        System.out.println("\n Updated details "); 
        d1.display();
        d2.display();
    }
}