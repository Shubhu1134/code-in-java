// Book Library
// Create a class Book with fields: title, author, and price.
// Use setters to assign values and a method to print book details.

class Book{ 
    private String title; 
    private String author ; 
    private double price ; 

    public void setTitle(String title){
        this.title = title; 
    }
    public void setAuthor(String author){
        this.author = author; 
    }
    public void setPrice(double price){
        this.price =  price ; 
    }
    public void printDetails(){
        System.out.println("--- Book Details----"); 
        System.out.println("Title : "+title );
        System.out.println("Title : "+title );
        System.out.println("Title : "+title );


    }
}