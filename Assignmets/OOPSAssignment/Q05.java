// 5. Write a Java program to create a class called "Book"
// with attributes for title, author, and ISBN, and methods
// to add and remove books from a collection.

import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
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
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getIsbn() {
        return isbn;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
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
        Book b1 = new Book("Java Basics", "John Doe", "12345");
        Book b2 = new Book("OOP in Java", "Jane Smith", "67890");

        BookCollection collection = new BookCollection();
        collection.addBook(b1);
        collection.addBook(b2);

        System.out.println("\nAll Books:");
        collection.displayBooks();

        collection.removeBook(b1);

        System.out.println("\nAfter removal:");
        collection.displayBooks();
    }
}
