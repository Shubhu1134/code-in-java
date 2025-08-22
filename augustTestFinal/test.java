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


import java.util.ArrayList;
import java.util.Random;

class Library {
    private ArrayList<String> books = new ArrayList<>();
    private Random random = new Random();

    public void addbook(String book) {
        books.add(book);
        System.out.println(book + " added to Library.");
    }

    public void removebook(String book) {
        if (books.remove(book)) {
            System.out.println(book + " removed.");
        } else {
            System.out.println(book + " not found.");
        }
    }

    public void openRandomBook() {
        if (books.isEmpty()) {
            System.out.println("No books in Library.");
        } else {
            String book = books.get(random.nextInt(books.size()));
            System.out.println("Reading: " + book);
        }
    }

    public void displaybooks() {
        System.out.println("books: " + books);
    }

    class Book{
        
    }
}

class TestMain {
    public static void main(String args[]) {
        Library bl = new Library();
        bl.addbook("book A");
        bl.addbook("book B");
        bl.displaybooks();
        bl.openRandomBook();
        bl.removebook("book A");
        bl.displaybooks();
    }
}
