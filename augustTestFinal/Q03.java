// Q3. (4 Marks) – OOP Based (Library Management)

// Design a simple Library Management System using classes with the following:
// A Book class with fields: id, title, author.
// A Library class with methods:
// addBook(Book b)
// listBooks()
// deleteBook(int id)
// Write a program to:
// Add 3 books.
// List all books.
// Delete a book by id and display remaining books.


import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String id;

    public Book(String title, String author, String id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }
    public Book() {}

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setid(String id) {
        this.id = id;
    }
    public String getid() {
        return id;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("id: " + id);
    }
}

class BookCollection {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
        System.out.println("Book added: " + b.getTitle());
    }

    public void removeBook(Book b) {
        if (books.remove(b)) {
            System.out.println("Book removed: " + b.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }

    public void displayBooks() {
        for (Book b : books) {
            b.display();
            System.out.println();
        }
    }
}

class TestMain {
    public static void main(String args[]) {
        Book b1 = new Book("Ram", "John Doe", "1");
        Book b2 = new Book("OOP in Java", "shubham", "2");
        Book b3= new Book(" osho ", "rahul ", "3");
     


        BookCollection collection = new BookCollection();
        collection.addBook(b1);
        collection.addBook(b2);
        collection.addBook(b3);

        System.out.println("\nAll Books:");
        collection.displayBooks();

        collection.removeBook(b1);

        System.out.println("\nAfter removal:");
        collection.displayBooks();
    }
}
