// Question8_Private_Constructor.java
// Private constructor is legal or illegal?

/*
ANSWER: Private constructor is LEGAL in Java.

PRIVATE CONSTRUCTOR:
A private constructor is a constructor with private access modifier. 
It can only be called from within the same class, not from outside classes.

WHEN TO USE PRIVATE CONSTRUCTORS:

1. SINGLETON DESIGN PATTERN: Ensure only one instance of the class exists
2. UTILITY CLASSES: Prevent instantiation of classes with only static methods
3. FACTORY PATTERN: Control object creation through factory methods
4. CONSTANTS CLASS: Prevent instantiation of classes that only hold constants
5. BUILDER PATTERN: Force users to use builder methods instead of direct construction
6. PREVENT SUBCLASSING: Private constructors cannot be called by subclasses

CHARACTERISTICS:
- Cannot be called from outside the class
- Can be called from within the class (by other constructors or static methods)
- Prevents direct instantiation using 'new' keyword
- Subclasses cannot call private constructors of parent class
- Can coexist with public constructors in the same class
*/

// Example 1: Singleton Pattern using Private Constructor
class DatabaseConnection {
    // Single instance variable
    private static DatabaseConnection instance;
    private String connectionString;
    private boolean isConnected;
    
    // PRIVATE CONSTRUCTOR - prevents direct instantiation
    private DatabaseConnection() {
        System.out.println("Private constructor called - Creating database connection");
        this.connectionString = "jdbc:mysql://localhost:3306/mydb";
        this.isConnected = false;
        connect();
    }
    
    // Public static method to get the single instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            System.out.println("Creating new database connection instance");
            instance = new DatabaseConnection();
        } else {
            System.out.println("Returning existing database connection instance");
        }
        return instance;
    }
    
    private void connect() {
        // Simulate database connection
        this.isConnected = true;
        System.out.println("Connected to database: " + connectionString);
    }
    
    public void executeQuery(String query) {
        if (isConnected) {
            System.out.println("Executing query: " + query);
        } else {
            System.out.println("Not connected to database");
        }
    }
    
    public void disconnect() {
        if (isConnected) {
            this.isConnected = false;
            System.out.println("Disconnected from database");
        }
    }
    
    public boolean isConnected() {
        return isConnected;
    }
}

// Example 2: Utility Class with Private Constructor
class MathUtils {
    // PRIVATE CONSTRUCTOR - prevents instantiation
    private MathUtils() {
        System.out.println("Private constructor called - MathUtils cannot be instantiated");
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }
    
    // All methods are static - no need for instance
    public static double calculateCircleArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return Math.PI * radius * radius;
    }
    
    public static double calculateRectangleArea(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width must be positive");
        }
        return length * width;
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        if (n <= 1) return 1;
        
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

// Example 3: Constants Class with Private Constructor
class ApplicationConstants {
    // PRIVATE CONSTRUCTOR - prevents instantiation
    private ApplicationConstants() {
        System.out.println("Private constructor called - Constants class cannot be instantiated");
    }
    
    // Application constants
    public static final String APP_NAME = "My Application";
    public static final String VERSION = "1.0.0";
    public static final int MAX_USERS = 1000;
    public static final double TAX_RATE = 0.08;
    
    // Database constants
    public static final String DB_URL = "jdbc:mysql://localhost:3306/";
    public static final String DB_USERNAME = "admin";
    public static final int CONNECTION_TIMEOUT = 30000;
    
    // UI constants
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;
    public static final String DEFAULT_THEME = "Light";
}

// Example 4: Factory Pattern using Private Constructor
class Car {
    private String brand;
    private String model;
    private String color;
    private double price;
    
    // PRIVATE CONSTRUCTOR - only factory methods can create instances
    private Car(String brand, String model, String color, double price) {
        System.out.println("Private constructor called - Creating car: " + brand + " " + model);
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }
    
    // Factory method for creating Toyota cars
    public static Car createToyota(String model, String color) {
        System.out.println("Factory method: Creating Toyota " + model);
        double basePrice = switch (model.toLowerCase()) {
            case "camry" -> 25000.0;
            case "corolla" -> 20000.0;
            case "rav4" -> 28000.0;
            default -> 22000.0;
        };
        return new Car("Toyota", model, color, basePrice);
    }
    
    // Factory method for creating Honda cars
    public static Car createHonda(String model, String color) {
        System.out.println("Factory method: Creating Honda " + model);
        double basePrice = switch (model.toLowerCase()) {
            case "civic" -> 22000.0;
            case "accord" -> 26000.0;
            case "crv" -> 29000.0;
            default -> 23000.0;
        };
        return new Car("Honda", model, color, basePrice);
    }
    
    // Factory method for creating BMW cars
    public static Car createBMW(String model, String color) {
        System.out.println("Factory method: Creating BMW " + model);
        double basePrice = switch (model.toLowerCase()) {
            case "3 series" -> 40000.0;
            case "5 series" -> 55000.0;
            case "x3" -> 45000.0;
            default -> 42000.0;
        };
        return new Car("BMW", model, color, basePrice);
    }
    
    // Factory method for custom car
    public static Car createCustomCar(String brand, String model, String color, double price) {
        System.out.println("Factory method: Creating custom car");
        return new Car(brand, model, color, price);
    }
    
    public void displayCar() {
        System.out.println("Car Details: " + brand + " " + model + 
                          ", Color: " + color + ", Price: $" + price);
    }
    
    // Getters
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getColor() { return color; }
    public double getPrice() { return price; }
}

// Example 5: Builder Pattern with Private Constructor
class Computer {
    // Required parameters
    private String cpu;
    private String ram;
    private String storage;
    
    // Optional parameters
    private String gpu;
    private String motherboard;
    private boolean hasWifi;
    private boolean hasBluetooth;
    private int usbPorts;
    
    // PRIVATE CONSTRUCTOR - only accessible through Builder
    private Computer(ComputerBuilder builder) {
        System.out.println("Private constructor called - Building computer");
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.motherboard = builder.motherboard;
        this.hasWifi = builder.hasWifi;
        this.hasBluetooth = builder.hasBluetooth;
        this.usbPorts = builder.usbPorts;
    }
    
    // Static Builder class
    public static class ComputerBuilder {
        // Required parameters
        private String cpu;
        private String ram;
        private String storage;
        
        // Optional parameters - initialized to default values
        private String gpu = "Integrated";
        private String motherboard = "Standard";
        private boolean hasWifi = false;
        private boolean hasBluetooth = false;
        private int usbPorts = 2;
        
        // Constructor with required parameters
        public ComputerBuilder(String cpu, String ram, String storage) {
            this.cpu = cpu;
            this.ram = ram;
            this.storage = storage;
        }
        
        // Methods to set optional parameters
        public ComputerBuilder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }
        
        public ComputerBuilder setMotherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }
        
        public ComputerBuilder setWifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }
        
        public ComputerBuilder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }
        
        public ComputerBuilder setUsbPorts(int usbPorts) {
            this.usbPorts = usbPorts;
            return this;
        }
        
        // Build method that calls private constructor
        public Computer build() {
            return new Computer(this);
        }
    }
    
    public void displayComputer() {
        System.out.println("Computer Configuration:");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("GPU: " + gpu);
        System.out.println("Motherboard: " + motherboard);
        System.out.println("WiFi: " + (hasWifi ? "Yes" : "No"));
        System.out.println("Bluetooth: " + (hasBluetooth ? "Yes" : "No"));
        System.out.println("USB Ports: " + usbPorts);
        System.out.println("=".repeat(30));
    }
}

// Example 6: Thread-Safe Singleton with Private Constructor
class Logger {
    private static volatile Logger instance;
    private String logLevel;
    private boolean isFileLogging;
    
    // PRIVATE CONSTRUCTOR - thread-safe singleton
    private Logger() {
        System.out.println("Private constructor called - Initializing logger");
        this.logLevel = "INFO";
        this.isFileLogging = false;
        System.out.println("Logger initialized with default settings");
    }
    
    // Double-checked locking for thread-safe singleton
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    System.out.println("Creating new logger instance (thread-safe)");
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    
    public void log(String message) {
        String timestamp = java.time.LocalDateTime.now().toString();
        String logMessage = "[" + timestamp + "] [" + logLevel + "] " + message;
        
        System.out.println(logMessage);
        
        if (isFileLogging) {
            // Simulate file logging
            System.out.println("Writing to log file: " + logMessage);
        }
    }
    
    public void setLogLevel(String level) {
        this.logLevel = level;
        System.out.println("Log level set to: " + level);
    }
    
    public void enableFileLogging(boolean enable) {
        this.isFileLogging = enable;
        System.out.println("File logging " + (enable ? "enabled" : "disabled"));
    }
}

// Example 7: Class demonstrating that private constructors prevent inheritance
class BaseClass {
    private String name;
    
    // PRIVATE CONSTRUCTOR - prevents inheritance
    private BaseClass(String name) {
        System.out.println("Private constructor of BaseClass called");
        this.name = name;
    }
    
    // Static factory method to create instances
    public static BaseClass createInstance(String name) {
        return new BaseClass(name);
    }
    
    public void displayName() {
        System.out.println("BaseClass name: " + name);
    }
}

/*
// This would cause compilation error because private constructor cannot be accessed
class ChildClass extends BaseClass {
    public ChildClass(String name) {
        super(name); // ERROR: BaseClass() has private access
    }
}
*/

public class Question8_Private_Constructor {
    
    private static void demonstrateSingleton() {
        System.out.println("=== SINGLETON PATTERN WITH PRIVATE CONSTRUCTOR ===\n");
        
        // Cannot create instance directly
        // DatabaseConnection db = new DatabaseConnection(); // Compilation Error
        
        System.out.println("1. Getting first database connection instance:");
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.executeQuery("SELECT * FROM users");
        
        System.out.println("\n2. Getting second database connection instance:");
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.executeQuery("SELECT * FROM products");
        
        System.out.println("\n3. Checking if both instances are the same:");
        System.out.println("db1 == db2: " + (db1 == db2));
        System.out.println("Both instances have same connection status: " + 
                          (db1.isConnected() == db2.isConnected()));
        
        db1.disconnect();
        System.out.println("After disconnecting db1, db2 connection status: " + db2.isConnected());
    }
    
    private static void demonstrateUtilityClass() {
        System.out.println("\n=== UTILITY CLASS WITH PRIVATE CONSTRUCTOR ===\n");
        
        // Cannot create instance
        // MathUtils utils = new MathUtils(); // Compilation Error
        
        System.out.println("Using static methods of MathUtils:");
        System.out.println("Circle area (radius=5): " + MathUtils.calculateCircleArea(5.0));
        System.out.println("Rectangle area (8x6): " + MathUtils.calculateRectangleArea(8.0, 6.0));
        System.out.println("Is 17 prime? " + MathUtils.isPrime(17));
        System.out.println("Is 15 prime? " + MathUtils.isPrime(15));
        System.out.println("Factorial of 5: " + MathUtils.factorial(5));
        
        // Trying to create instance would throw exception
        try {
            // This would call private constructor and throw exception
            System.out.println("\nAttempting to create MathUtils instance using reflection:");
            MathUtils.class.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getCause().getMessage());
        }
    }
    
    private static void demonstrateConstantsClass() {
        System.out.println("\n=== CONSTANTS CLASS WITH PRIVATE CONSTRUCTOR ===\n");
        
        // Cannot create instance
        // ApplicationConstants constants = new ApplicationConstants(); // Compilation Error
        
        System.out.println("Using constants from ApplicationConstants:");
        System.out.println("App Name: " + ApplicationConstants.APP_NAME);
        System.out.println("Version: " + ApplicationConstants.VERSION);
        System.out.println("Max Users: " + ApplicationConstants.MAX_USERS);
        System.out.println("Tax Rate: " + ApplicationConstants.TAX_RATE);
        System.out.println("Database URL: " + ApplicationConstants.DB_URL);
        System.out.println("Window Size: " + ApplicationConstants.WINDOW_WIDTH + 
                          "x" + ApplicationConstants.WINDOW_HEIGHT);
    }
    
    private static void demonstrateFactoryPattern() {
        System.out.println("\n=== FACTORY PATTERN WITH PRIVATE CONSTRUCTOR ===\n");
        
        // Cannot create Car directly
        // Car car = new Car("Toyota", "Camry", "Blue", 25000); // Compilation Error
        
        System.out.println("Creating cars using factory methods:");
        
        Car toyota = Car.createToyota("Camry", "Blue");
        toyota.displayCar();
        
        Car honda = Car.createHonda("Civic", "Red");
        honda.displayCar();
        
        Car bmw = Car.createBMW("3 Series", "Black");
        bmw.displayCar();
        
        Car custom = Car.createCustomCar("Tesla", "Model S", "White", 80000);
        custom.displayCar();
    }
    
    private static void demonstrateBuilderPattern() {
        System.out.println("\n=== BUILDER PATTERN WITH PRIVATE CONSTRUCTOR ===\n");
        
        // Cannot create Computer directly
        // Computer comp = new Computer(); // Compilation Error
        
        System.out.println("Creating computers using Builder pattern:");
        
        Computer basicComputer = new Computer.ComputerBuilder("Intel i5", "8GB", "256GB SSD")
                .build();
        basicComputer.displayComputer();
        
        Computer gamingComputer = new Computer.ComputerBuilder("Intel i7", "16GB", "1TB SSD")
                .setGpu("RTX 3080")
                .setMotherboard("Gaming")
                .setWifi(true)
                .setBluetooth(true)
                .setUsbPorts(6)
                .build();
        gamingComputer.displayComputer();
        
        Computer workstationComputer = new Computer.ComputerBuilder("AMD Ryzen 9", "32GB", "2TB SSD")
                .setGpu("Quadro RTX")
                .setMotherboard("Workstation")
                .setWifi(true)
                .setUsbPorts(8)
                .build();
        workstationComputer.displayComputer();
    }
    
    private static void demonstrateThreadSafeSingleton() {
        System.out.println("\n=== THREAD-SAFE SINGLETON WITH PRIVATE CONSTRUCTOR ===\n");
        
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started");
        
        Logger logger2 = Logger.getInstance();
        logger2.setLogLevel("DEBUG");
        logger2.enableFileLogging(true);
        logger2.log("Debug message");
        
        System.out.println("Are both logger instances the same? " + (logger1 == logger2));
        
        // Both loggers have the same settings because they're the same instance
        logger1.log("Message from logger1 with settings from logger2");
    }
    
    public static void main(String[] args) {
        System.out.println("PRIVATE CONSTRUCTOR IN JAVA - LEGAL AND USEFUL");
        System.out.println("=".repeat(70) + "\n");
        
        demonstrateSingleton();
        demonstrateUtilityClass();
        demonstrateConstantsClass();
        demonstrateFactoryPattern();
        demonstrateBuilderPattern();
        demonstrateThreadSafeSingleton();
        
        System.out.println("\n" + "=".repeat(70));
        System.out.println("ANSWER: PRIVATE CONSTRUCTOR IS LEGAL IN JAVA");
        System.out.println("=".repeat(70));
        
        String[] useCases = {
            "1. SINGLETON PATTERN: Ensure only one instance exists",
            "2. UTILITY CLASSES: Prevent instantiation of classes with only static methods",
            "3. CONSTANTS CLASSES: Prevent instantiation of classes holding only constants",
            "4. FACTORY PATTERN: Control object creation through factory methods",
            "5. BUILDER PATTERN: Force users to use builder instead of direct construction",
            "6. PREVENT INHERITANCE: Private constructors cannot be called by subclasses",
            "7. THREAD SAFETY: Combine with singleton for thread-safe single instances",
            "8. SECURITY: Prevent unauthorized instantiation of sensitive classes"
        };
        
        System.out.println("\nUSE CASES FOR PRIVATE CONSTRUCTORS:");
        for (String useCase : useCases) {
            System.out.println(useCase);
        }
        
        System.out.println("\nKEY CHARACTERISTICS:");
        System.out.println("✓ Cannot be called from outside the class");
        System.out.println("✓ Can be called from within the class (static methods, other constructors)");
        System.out.println("✓ Prevents direct instantiation using 'new' keyword");
        System.out.println("✓ Prevents inheritance (subclasses cannot call private parent constructors)");
        System.out.println("✓ Can coexist with public constructors");
        System.out.println("✓ Useful for design patterns and controlled object creation");
    }
}