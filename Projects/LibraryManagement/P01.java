// ============================================================================
// COMPREHENSIVE JAVA LEARNING PROJECT: LIBRARY MANAGEMENT SYSTEM
// This project demonstrates Java concepts from basics to Object-Oriented Programming
// ============================================================================

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// ============================================================================
// 1. BASIC JAVA CONCEPTS DEMONSTRATION
// ============================================================================

class JavaBasics {
    
    // Variables and Data Types
    static int totalBooks = 0;           // Static variable
    private String libraryName;          // Instance variable
    final double LATE_FEE = 0.50;       // Final variable (constant)
    
    // Constructor demonstrating parameter passing
    public JavaBasics(String name) {
        this.libraryName = name;
        System.out.println("=== Java Basics Demo ===");
        demonstrateDataTypes();
        demonstrateOperators();
        demonstrateControlStructures();
        demonstrateArrays();
        demonstrateMethods();
    }
    
    // Method demonstrating all data types
    private void demonstrateDataTypes() {
        System.out.println("\n1. DATA TYPES:");
        
        // Primitive data types
        byte byteVar = 127;                    // 1 byte
        short shortVar = 32000;                // 2 bytes
        int intVar = 2000000;                  // 4 bytes
        long longVar = 9000000000L;            // 8 bytes
        float floatVar = 3.14f;                // 4 bytes
        double doubleVar = 3.141592653589;     // 8 bytes
        char charVar = 'A';                    // 2 bytes
        boolean boolVar = true;                // 1 bit
        
        // Non-primitive data types
        String stringVar = "Library Management System";
        int[] arrayVar = {1, 2, 3, 4, 5};
        
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
        System.out.println("String: " + stringVar);
        System.out.println("Array: " + Arrays.toString(arrayVar));
    }
    
    // Method demonstrating operators
    private void demonstrateOperators() {
        System.out.println("\n2. OPERATORS:");
        int a = 10, b = 3;
        
        // Arithmetic operators
        System.out.println("Arithmetic: " + a + " + " + b + " = " + (a + b));
        System.out.println("Arithmetic: " + a + " - " + b + " = " + (a - b));
        System.out.println("Arithmetic: " + a + " * " + b + " = " + (a * b));
        System.out.println("Arithmetic: " + a + " / " + b + " = " + (a / b));
        System.out.println("Arithmetic: " + a + " % " + b + " = " + (a % b));
        
        // Relational operators
        System.out.println("Relational: " + a + " > " + b + " = " + (a > b));
        System.out.println("Relational: " + a + " == " + b + " = " + (a == b));
        
        // Logical operators
        boolean x = true, y = false;
        System.out.println("Logical: " + x + " && " + y + " = " + (x && y));
        System.out.println("Logical: " + x + " || " + y + " = " + (x || y));
        System.out.println("Logical: !" + x + " = " + (!x));
        
        // Assignment operators
        int c = a;
        c += b; // c = c + b
        System.out.println("Assignment: c += " + b + " = " + c);
        
        // Increment/Decrement operators
        System.out.println("Pre-increment: ++a = " + (++a));
        System.out.println("Post-increment: b++ = " + (b++));
        System.out.println("After post-increment, b = " + b);
    }
    
    // Method demonstrating control structures
    private void demonstrateControlStructures() {
        System.out.println("\n3. CONTROL STRUCTURES:");
        
        // If-else statement
        int bookCount = 150;
        if (bookCount > 100) {
            System.out.println("If-else: Large library with " + bookCount + " books");
        } else if (bookCount > 50) {
            System.out.println("If-else: Medium library");
        } else {
            System.out.println("If-else: Small library");
        }
        
        // Switch statement
        String genre = "Fiction";
        switch (genre) {
            case "Fiction":
                System.out.println("Switch: Popular genre - Fiction");
                break;
            case "Science":
                System.out.println("Switch: Educational genre - Science");
                break;
            case "History":
                System.out.println("Switch: Informative genre - History");
                break;
            default:
                System.out.println("Switch: Other genre");
        }
        
        // For loop
        System.out.print("For loop: Book IDs: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print("B" + i + " ");
        }
        System.out.println();
        
        // Enhanced for loop
        String[] categories = {"Fiction", "Non-Fiction", "Science", "History", "Biography"};
        System.out.print("Enhanced for loop: Categories: ");
        for (String category : categories) {
            System.out.print(category + " ");
        }
        System.out.println();
        
        // While loop
        System.out.print("While loop: Countdown: ");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();
        
        // Do-while loop
        System.out.print("Do-while loop: At least once: ");
        int i = 0;
        do {
            System.out.print("Executed ");
            i++;
        } while (i < 1);
        System.out.println();
    }
    
    // Method demonstrating arrays
    private void demonstrateArrays() {
        System.out.println("\n4. ARRAYS:");
        
        // Single-dimensional array
        int[] bookIds = new int[5];
        for (int i = 0; i < bookIds.length; i++) {
            bookIds[i] = 1000 + i;
        }
        System.out.println("1D Array - Book IDs: " + Arrays.toString(bookIds));
        
        // Multi-dimensional array
        String[][] library = {
            {"Fiction", "To Kill a Mockingbird", "Harper Lee"},
            {"Science", "A Brief History of Time", "Stephen Hawking"},
            {"History", "Sapiens", "Yuval Noah Harari"}
        };
        System.out.println("2D Array - Library Collection:");
        for (int i = 0; i < library.length; i++) {
            System.out.println("  " + Arrays.toString(library[i]));
        }
        
        // Array methods
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Before sorting: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After sorting: " + Arrays.toString(numbers));
        
        // Array search
        int searchKey = 25;
        int index = Arrays.binarySearch(numbers, searchKey);
        System.out.println("Index of " + searchKey + ": " + index);
    }
    
    // Method demonstrating different types of methods
    private void demonstrateMethods() {
        System.out.println("\n5. METHODS:");
        
        // Method with no parameters and no return value
        displayWelcome();
        
        // Method with parameters and return value
        int sum = addNumbers(10, 20);
        System.out.println("Sum: " + sum);
        
        // Method with variable arguments (varargs)
        double average = calculateAverage(85.5, 92.0, 78.5, 88.0);
        System.out.println("Average: " + average);
        
        // Method overloading
        System.out.println("Area of circle: " + calculateArea(5.0));
        System.out.println("Area of rectangle: " + calculateArea(4.0, 6.0));
        
        // Recursive method
        int factorial = calculateFactorial(5);
        System.out.println("Factorial of 5: " + factorial);
    }
    
    // Method with no parameters and no return value
    public void displayWelcome() {
        System.out.println("Welcome to " + this.libraryName + "!");
    }
    
    // Method with parameters and return value
    public int addNumbers(int a, int b) {
        return a + b;
    }
    
    // Method with variable arguments
    public double calculateAverage(double... scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
    
    // Method overloading - same name, different parameters
    public double calculateArea(double radius) {
        return Math.PI * radius * radius; // Circle area
    }
    
    public double calculateArea(double length, double width) {
        return length * width; // Rectangle area
    }
    
    // Recursive method
    public int calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}

// ============================================================================
// 2. OBJECT-ORIENTED PROGRAMMING CONCEPTS
// ============================================================================

// Abstract class demonstrating abstraction
abstract class LibraryItem {
    protected String id;
    protected String title;
    protected boolean isAvailable;
    protected LocalDate dateAdded;
    
    // Constructor
    public LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
        this.isAvailable = true;
        this.dateAdded = LocalDate.now();
    }
    
    // Abstract method - must be implemented by subclasses
    public abstract void displayDetails();
    
    // Concrete method - can be used by all subclasses
    public void checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }
    
    public void checkIn() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " is already available.");
        }
    }
    
    // Getters and setters demonstrating encapsulation
    public String getId() { return id; }
    public String getTitle() { return title; }
    public boolean isAvailable() { return isAvailable; }
    public LocalDate getDateAdded() { return dateAdded; }
}

// Interface demonstrating interface concept
interface Searchable {
    boolean matchesKeyword(String keyword);
    String getSearchableContent();
}

// Interface for renewable items
interface Renewable {
    boolean canRenew();
    void renewItem();
}

// Book class demonstrating inheritance, encapsulation
class Book extends LibraryItem implements Searchable, Renewable {
    private String author;
    private String isbn;
    private String genre;
    private int pageCount;
    private int renewalCount;
    private static final int MAX_RENEWALS = 2;
    
    // Constructor demonstrating constructor overloading
    public Book(String id, String title, String author) {
        super(id, title);
        this.author = author;
        this.renewalCount = 0;
    }
    
    public Book(String id, String title, String author, String isbn, String genre, int pageCount) {
        super(id, title);
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.pageCount = pageCount;
        this.renewalCount = 0;
    }
    
    // Implementation of abstract method from LibraryItem
    @Override
    public void displayDetails() {
        System.out.println("=== BOOK DETAILS ===");
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + (isbn != null ? isbn : "N/A"));
        System.out.println("Genre: " + (genre != null ? genre : "N/A"));
        System.out.println("Pages: " + (pageCount > 0 ? pageCount : "N/A"));
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("Date Added: " + dateAdded.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Renewals Used: " + renewalCount + "/" + MAX_RENEWALS);
    }
    
    // Implementation of Searchable interface
    @Override
    public boolean matchesKeyword(String keyword) {
        keyword = keyword.toLowerCase();
        return title.toLowerCase().contains(keyword) || 
               author.toLowerCase().contains(keyword) ||
               (genre != null && genre.toLowerCase().contains(keyword));
    }
    
    @Override
    public String getSearchableContent() {
        return title + " " + author + " " + (genre != null ? genre : "");
    }
    
    // Implementation of Renewable interface
    @Override
    public boolean canRenew() {
        return renewalCount < MAX_RENEWALS && !isAvailable;
    }
    
    @Override
    public void renewItem() {
        if (canRenew()) {
            renewalCount++;
            System.out.println(title + " has been renewed. Renewals used: " + renewalCount + "/" + MAX_RENEWALS);
        } else {
            System.out.println("Cannot renew " + title + ". Maximum renewals reached or item is available.");
        }
    }
    
    // Getters and setters
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public String getGenre() { return genre; }
    public int getPageCount() { return pageCount; }
    public int getRenewalCount() { return renewalCount; }
    
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setPageCount(int pageCount) { this.pageCount = pageCount; }
}

// Magazine class demonstrating inheritance
class Magazine extends LibraryItem implements Searchable {
    private String publisher;
    private int issueNumber;
    private String issueMonth;
    private int issueYear;
    
    public Magazine(String id, String title, String publisher, int issueNumber, String issueMonth, int issueYear) {
        super(id, title);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
        this.issueMonth = issueMonth;
        this.issueYear = issueYear;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("=== MAGAZINE DETAILS ===");
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Issue: " + issueNumber + " (" + issueMonth + " " + issueYear + ")");
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("Date Added: " + dateAdded.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
    
    @Override
    public boolean matchesKeyword(String keyword) {
        keyword = keyword.toLowerCase();
        return title.toLowerCase().contains(keyword) || 
               publisher.toLowerCase().contains(keyword) ||
               issueMonth.toLowerCase().contains(keyword);
    }
    
    @Override
    public String getSearchableContent() {
        return title + " " + publisher + " " + issueMonth + " " + issueYear;
    }
    
    // Getters
    public String getPublisher() { return publisher; }
    public int getIssueNumber() { return issueNumber; }
    public String getIssueMonth() { return issueMonth; }
    public int getIssueYear() { return issueYear; }
}

// DVD class demonstrating inheritance
class DVD extends LibraryItem implements Searchable, Renewable {
    private String director;
    private int duration; // in minutes
    private String rating;
    private String genre;
    private int renewalCount;
    private static final int MAX_RENEWALS = 1;
    
    public DVD(String id, String title, String director, int duration, String rating, String genre) {
        super(id, title);
        this.director = director;
        this.duration = duration;
        this.rating = rating;
        this.genre = genre;
        this.renewalCount = 0;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("=== DVD DETAILS ===");
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Rating: " + rating);
        System.out.println("Genre: " + genre);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("Date Added: " + dateAdded.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Renewals Used: " + renewalCount + "/" + MAX_RENEWALS);
    }
    
    @Override
    public boolean matchesKeyword(String keyword) {
        keyword = keyword.toLowerCase();
        return title.toLowerCase().contains(keyword) || 
               director.toLowerCase().contains(keyword) ||
               genre.toLowerCase().contains(keyword);
    }
    
    @Override
    public String getSearchableContent() {
        return title + " " + director + " " + genre;
    }
    
    @Override
    public boolean canRenew() {
        return renewalCount < MAX_RENEWALS && !isAvailable;
    }
    
    @Override
    public void renewItem() {
        if (canRenew()) {
            renewalCount++;
            System.out.println(title + " has been renewed. Renewals used: " + renewalCount + "/" + MAX_RENEWALS);
        } else {
            System.out.println("Cannot renew " + title + ". Maximum renewals reached or item is available.");
        }
    }
    
    // Getters
    public String getDirector() { return director; }
    public int getDuration() { return duration; }
    public String getRating() { return rating; }
    public String getGenre() { return genre; }
    public int getRenewalCount() { return renewalCount; }
}

// User class demonstrating composition
class LibraryUser {
    private String userId;
    private String name;
    private String email;
    private String phone;
    private List<LibraryItem> checkedOutItems;
    private LocalDate membershipDate;
    
    public LibraryUser(String userId, String name, String email, String phone) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.checkedOutItems = new ArrayList<>();
        this.membershipDate = LocalDate.now();
    }
    
    public void checkOutItem(LibraryItem item) {
        if (item.isAvailable()) {
            item.checkOut();
            checkedOutItems.add(item);
            System.out.println(name + " checked out: " + item.getTitle());
        } else {
            System.out.println("Item is not available for checkout.");
        }
    }
    
    public void returnItem(LibraryItem item) {
        if (checkedOutItems.contains(item)) {
            item.checkIn();
            checkedOutItems.remove(item);
            System.out.println(name + " returned: " + item.getTitle());
        } else {
            System.out.println("This item was not checked out by " + name);
        }
    }
    
    public void displayUserInfo() {
        System.out.println("=== USER INFORMATION ===");
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Member since: " + membershipDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Items checked out: " + checkedOutItems.size());
        if (!checkedOutItems.isEmpty()) {
            System.out.println("Checked out items:");
            for (LibraryItem item : checkedOutItems) {
                System.out.println("  - " + item.getTitle());
            }
        }
    }
    
    // Getters
    public String getUserId() { return userId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public List<LibraryItem> getCheckedOutItems() { return checkedOutItems; }
    public LocalDate getMembershipDate() { return membershipDate; }
}

// Library Management System class demonstrating composition and aggregation
class LibraryManagementSystem {
    private String libraryName;
    private List<LibraryItem> catalog;
    private List<LibraryUser> users;
    private Map<String, LibraryItem> itemIndex;
    private Map<String, LibraryUser> userIndex;
    
    public LibraryManagementSystem(String libraryName) {
        this.libraryName = libraryName;
        this.catalog = new ArrayList<>();
        this.users = new ArrayList<>();
        this.itemIndex = new HashMap<>();
        this.userIndex = new HashMap<>();
        System.out.println("\n=== " + libraryName + " System Initialized ===");
    }
    
    // Polymorphism demonstration - method accepts any LibraryItem subclass
    public void addItem(LibraryItem item) {
        catalog.add(item);
        itemIndex.put(item.getId(), item);
        System.out.println("Added to catalog: " + item.getTitle());
    }
    
    public void addUser(LibraryUser user) {
        users.add(user);
        userIndex.put(user.getUserId(), user);
        System.out.println("Added user: " + user.getName());
    }
    
    public void searchItems(String keyword) {
        System.out.println("\n=== Search Results for '" + keyword + "' ===");
        boolean found = false;
        for (LibraryItem item : catalog) {
            if (item instanceof Searchable) {
                Searchable searchableItem = (Searchable) item;
                if (searchableItem.matchesKeyword(keyword)) {
                    System.out.println("Found: " + item.getTitle() + " (ID: " + item.getId() + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No items found matching '" + keyword + "'");
        }
    }
    
    public void displayCatalog() {
        System.out.println("\n=== " + libraryName + " Catalog ===");
        System.out.println("Total items: " + catalog.size());
        for (LibraryItem item : catalog) {
            System.out.println("- " + item.getTitle() + " [" + item.getClass().getSimpleName() + "] " + 
                             (item.isAvailable() ? "(Available)" : "(Checked Out)"));
        }
    }
    
    public void displayUsers() {
        System.out.println("\n=== Registered Users ===");
        System.out.println("Total users: " + users.size());
        for (LibraryUser user : users) {
            System.out.println("- " + user.getName() + " (ID: " + user.getUserId() + ") " +
                             "- Checked out items: " + user.getCheckedOutItems().size());
        }
    }
    
    public LibraryItem findItem(String itemId) {
        return itemIndex.get(itemId);
    }
    
    public LibraryUser findUser(String userId) {
        return userIndex.get(userId);
    }
    
    public void processCheckout(String userId, String itemId) {
        LibraryUser user = findUser(userId);
        LibraryItem item = findItem(itemId);
        
        if (user != null && item != null) {
            user.checkOutItem(item);
        } else {
            System.out.println("User or item not found.");
        }
    }
    
    public void processReturn(String userId, String itemId) {
        LibraryUser user = findUser(userId);
        LibraryItem item = findItem(itemId);
        
        if (user != null && item != null) {
            user.returnItem(item);
        } else {
            System.out.println("User or item not found.");
        }
    }
    
    // Demonstration of method overloading with different parameter types
    public void generateReport() {
        generateReport("summary");
    }
    
    public void generateReport(String type) {
        System.out.println("\n=== " + libraryName + " Report (" + type.toUpperCase() + ") ===");
        
        if (type.equals("detailed")) {
            System.out.println("Detailed Library Statistics:");
            System.out.println("Total Items: " + catalog.size());
            
            // Count by type using instanceof
            int books = 0, magazines = 0, dvds = 0;
            int availableItems = 0, checkedOutItems = 0;
            
            for (LibraryItem item : catalog) {
                if (item instanceof Book) books++;
                else if (item instanceof Magazine) magazines++;
                else if (item instanceof DVD) dvds++;
                
                if (item.isAvailable()) availableItems++;
                else checkedOutItems++;
            }
            
            System.out.println("  - Books: " + books);
            System.out.println("  - Magazines: " + magazines);
            System.out.println("  - DVDs: " + dvds);
            System.out.println("Available Items: " + availableItems);
            System.out.println("Checked Out Items: " + checkedOutItems);
            System.out.println("Total Users: " + users.size());
            
            // Calculate total items checked out by all users
            int totalCheckedOutByUsers = 0;
            for (LibraryUser user : users) {
                totalCheckedOutByUsers += user.getCheckedOutItems().size();
            }
            System.out.println("Total Items with Users: " + totalCheckedOutByUsers);
            
        } else {
            System.out.println("Summary: " + catalog.size() + " items, " + users.size() + " users");
        }
    }
}

// // ============================================================================
// // 3. MAIN CLASS - DEMONSTRATION OF ALL CONCEPTS
// // ============================================================================

// public class LibrarySystemDemo {
//     public static void main(String[] args) {
//         System.out.println("COMPREHENSIVE JAVA LEARNING PROJECT");
//         System.out.println("====================================");
        
//         // 1. Demonstrate basic Java concepts
//         JavaBasics basics = new JavaBasics("City Central Library");
        
//         System.out.println("\n" + "=".repeat(60));
//         System.out.println("OBJECT-ORIENTED PROGRAMMING DEMONSTRATION");
//         System.out.println("=".repeat(60));
        
//         // 2. Create Library Management System
//         LibraryManagementSystem library = new LibraryManagementSystem("City Central Library");
        
//         // 3. Create different types of library items (Polymorphism)
//         System.out.println("\n--- Adding Items to Library ---");
        
//         // Creating Book objects
//         Book book1 = new Book("B001", "To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4", "Fiction", 376);
//         Book book2 = new Book("B002", "1984", "George Orwell", "978-0-452-28423-4", "Dystopian Fiction", 328);
//         Book book3 = new Book("B003", "The Catcher in the Rye", "J.D. Salinger");
        
//         // Creating Magazine objects
//         Magazine mag1 = new Magazine("M001", "National Geographic", "National Geographic Society", 5, "May", 2024);
//         Magazine mag2 = new Magazine("M002", "Scientific American", "Scientific American Inc.", 3, "March", 2024);
        
//         // Creating DVD objects
//         DVD dvd1 = new DVD("D001", "The Shawshank Redemption", "Frank Darabont", 142, "R", "Drama");
//         DVD dvd2 = new DVD("D002", "Inception", "Christopher Nolan", 148, "PG-13", "Sci-Fi");
        
//         // Adding items to library (Polymorphism - treating different objects uniformly)
//         library.addItem(book1);
//         library.addItem(book2);
//         library.addItem(book3);
//         library.addItem(mag1);
//         library.addItem(mag2);
//         library.addItem(dvd1);
//         library.addItem(dvd2);
        
//         // 4. Create users
//         System.out.println("\n--- Adding Users to System ---");
//         LibraryUser user1 = new LibraryUser("U001", "Alice Johnson", "alice@email.com", "123-456-7890");
//         LibraryUser user2 = new LibraryUser("U002", "Bob Smith", "bob@email.com", "098-765-4321");
        
//         library.addUser(user1);
//         library.addUser(user2);
        
//         // 5. Display catalog and users
//         library.displayCatalog();
//         library.displayUsers();
        
//         // 6. Demonstrate search functionality (Interface implementation)
//         library.searchItems("Fiction");
//         library.searchItems("Nolan");
//         library.searchItems("Geographic");
        
//         // 7. Demonstrate checkout and return (Method calls and state changes)
//         System.out.println("\n--- Checkout and Return Operations ---");
//         library.
