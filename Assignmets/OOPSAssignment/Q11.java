// 11. Write a Java program to create a class called "Library"
// with a collection of books and methods to add and remove books.

import java.util.ArrayList;

class Library {
    private ArrayList<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
        System.out.println(book + " added to library.");
    }

    public void removeBook(String book) {
        if (books.remove(book)) {
            System.out.println(book + " removed from library.");
        } else {
            System.out.println(book + " not found.");
        }
    }

    public void displayBooks() {
        System.out.println("Books in library: " + books);
    }
}

class TestMain {
    public static void main(String args[]) {
        Library lib = new Library();
        lib.addBook("Java Programming");
        lib.addBook("Data Structures");
        lib.displayBooks();
        lib.removeBook("Java Programming");
        lib.displayBooks();
    }
}
