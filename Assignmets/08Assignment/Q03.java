
class Book {
    private String title;
    private String author;
    private double price;

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to print book details
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }
}

public class Test {
    public static void main(String[] args) {
        Book obj = new Book();
        obj.setTitle("Java Made Easy");
        obj.setAuthor("John Doe");
        obj.setPrice(399.99);

        obj.printDetails();
    }
}