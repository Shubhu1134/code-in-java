// Question9_Singleton.java
// What is Singleton class? Explain with suitable example.

/*
SINGLETON DESIGN PATTERN:

DEFINITION:
Singleton is a creational design pattern that ensures a class has only one instance 
throughout the application's lifetime and provides a global point of access to that instance.

KEY CHARACTERISTICS:
1. Only one instance of the class can exist
2. The instance is created by the class itself
3. Provides global access to the instance
4. Uses private constructor to prevent direct instantiation
5. Typically uses static method to get the instance

WHEN TO USE SINGLETON:
- Database connections
- Logger classes
- Configuration managers
- Cache managers
- Thread pools
- Print spoolers
- File systems
- Registry objects

IMPLEMENTATION APPROACHES:
1. Eager initialization
2. Lazy initialization
3. Thread-safe lazy initialization
4. Double-checked locking
5. Enum-based singleton
6. Static block initialization
*/

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

// Example 1: Basic Singleton - Database Connection Manager
class DatabaseManager {
    // Static variable to hold the single instance
    private static DatabaseManager instance;
    
    // Instance variables
    private String connectionUrl;
    private boolean isConnected;
    private int connectionCount;
    
    // PRIVATE CONSTRUCTOR - prevents external instantiation
    private DatabaseManager() {
        System.out.println("DatabaseManager: Private constructor called");
        this.connectionUrl = "jdbc:mysql://localhost:3306/myapp";
        this.isConnected = false;
        this.connectionCount = 0;
        initializeConnection();
    }
    
    // PUBLIC STATIC METHOD to get the instance
    public static DatabaseManager getInstance() {
        if (instance == null) {
            System.out.println("DatabaseManager: Creating new instance");
            instance = new DatabaseManager();
        } else {
            System.out.println("DatabaseManager: Returning existing instance");
        }
        return instance;
    }
    
    private void initializeConnection() {
        // Simulate database connection initialization
        this.isConnected = true;
        this.connectionCount++;
        System.out.println("Database connected: " + connectionUrl);
    }
    
    public void executeQuery(String query) {
        if (isConnected) {
            System.out.println("Executing: " + query);
        } else {
            System.out.println("Database not connected!");
        }
    }
    
    public void showConnectionInfo() {
        System.out.println("Connection URL: " + connectionUrl);
        System.out.println("Connected: " + isConnected);
        System.out.println("Connection attempts: " + connectionCount);
    }
}

// Example 2: Thread-Safe Singleton - Logger Class
class Logger {
    // Volatile keyword ensures thread safety
    private static volatile Logger instance;
    private String logLevel;
    private List<String> logHistory;
    
    // Private constructor
    private Logger() {
        System.out.println("Logger: Private constructor called");
        this.logLevel = "INFO";
        this.logHistory = new ArrayList<>();
        System.out.println("Logger initialized with level: " + logLevel);
    }
    
    // Double-checked locking for thread safety
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    System.out.println("Logger: Creating new thread-safe instance");
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    
    public void log(String level, String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String logEntry = String.format("[%s] [%s] %s", timestamp, level, message);
        
        logHistory.add(logEntry);
        System.out.println(logEntry);
    }
    
    public void info(String message) {
        log("INFO", message);
    }
    
    public void error(String message) {
        log("ERROR", message);
    }
    
    public void debug(String message) {
        log("DEBUG", message);
    }
    
    public void setLogLevel(String level) {
        this.logLevel = level;
        log("SYSTEM", "Log level changed to: " + level);
    }
    
    public void showLogHistory() {
        System.out.println("\n=== LOG HISTORY ===");
        for (String logEntry : logHistory) {
            System.out.println(logEntry);
        }
        System.out.println("Total logs: " + logHistory.size());
        System.out.println("===================");
    }
}

// Example 3: Eager Initialization Singleton - Configuration Manager
class ConfigurationManager {
    // Eager initialization - instance created at class loading time
    private static final ConfigurationManager instance = new ConfigurationManager();
    
    private Properties config;
    private String configFile;
    
    // Private constructor
    private ConfigurationManager() {
        System.out.println("ConfigurationManager: Eager initialization constructor called");
        this.config = new Properties();
        this.configFile = "app.properties";
        loadDefaultConfiguration();
    }
    
    // Static method to get the instance
    public static ConfigurationManager getInstance() {
        System.out.println("ConfigurationManager: Returning eagerly initialized instance");
        return instance;
    }
    
    private void loadDefaultConfiguration() {
        // Load default configuration
        config.setProperty("app.name", "My Application");
        config.setProperty("app.version", "1.0.0");
        config.setProperty("database.host", "localhost");
        config.setProperty("database.port", "3306");
        config.setProperty("cache.size", "100");
        System.out.println("Default configuration loaded");
    }
    
    public String getProperty(String key) {
        return config.getProperty(key);
    }
    
    public void setProperty(String key, String value) {
        config.setProperty(key, value);
        System.out.println("Property set: " + key + " = " + value);
    }
    
    public void showAllProperties() {
        System.out.println("\n=== CONFIGURATION PROPERTIES ===");
        for (String key : config.stringPropertyNames()) {
            System.out.println(key + " = " + config.getProperty(key));
        }
        System.out.println("=================================");
    }
}

// Example 4: Enum-based Singleton (Best approach for simple singletons)
enum PrinterManager {
    INSTANCE;
    
    private String printerName;
    private boolean isPrinterOnline;
    private Queue<String> printQueue;
    
    // Constructor (called only once)
    PrinterManager() {
        System.out.println("PrinterManager: Enum-based singleton constructor called");
        this.printerName = "Default Printer";
        this.isPrinterOnline = true;
        this.printQueue = new LinkedList<>();
        System.out.println("Printer manager initialized: " + printerName);
    }
    
    public void print(String document) {
        if (isPrinterOnline) {
            printQueue.offer(document);
            System.out.println("Document added to print queue: " + document);
            processQueue();
        } else {
            System.out.println("Printer is offline. Cannot print: " + document);
        }
    }
    
    private void processQueue() {
        if (!printQueue.isEmpty()) {
            String document = printQueue.poll();
            System.out.println("Printing: " + document + " on " + printerName);
        }
    }
    
    public void setPrinterOnline(boolean online) {
        this.isPrinterOnline = online;
        System.out.println("Printer status: " + (online ? "Online" : "Offline"));
    }
    
    public void showPrintQueue() {
        System.out.println("Print queue size: " + printQueue.size());
        if (!printQueue.isEmpty()) {
            System.out.println("Documents in queue: " + printQueue);
        }
    }
}

// Example 5: Singleton with Static Block Initialization
class CacheManager {
    private static CacheManager instance;
    
    private Map<String, Object> cache;
    private int maxSize;
    private int hitCount;
    private int missCount;
    
    // Static block for initialization
    static {
        try {
            System.out.println("CacheManager: Static block initialization");
            instance = new CacheManager();
        } catch (Exception e) {
            System.err.println("Exception in creating singleton instance: " + e.getMessage());
        }
    }
    
    private CacheManager() {
        System.out.println("CacheManager: Private constructor called");
        this.cache = new HashMap<>();
        this.maxSize = 100;
        this.hitCount = 0;
        this.missCount = 0;
        System.out.println("Cache initialized with max size: " + maxSize);
    }
    
    public static CacheManager getInstance() {
        return instance;
    }
    
    public void put(String key, Object value) {
        if (cache.size() >= maxSize) {
            // Simple eviction: remove first entry
            String firstKey = cache.keySet().iterator().next();
            cache.remove(firstKey);
            System.out.println("Cache full. Evicted: " + firstKey);
        }
        cache.put(key, value);
        System.out.println("Cached: " + key + " = " + value);
    }
    
    public Object get(String key) {
        Object value = cache.get(key);
        if (value != null) {
            hitCount++;
            System.out.println("Cache HIT: " + key + " = " + value);
        } else {
            missCount++;
            System.out.println("Cache MISS: " + key);
        }
        return value;
    }
    
    public void showCacheStatistics() {
        System.out.println("\n=== CACHE STATISTICS ===");
        System.out.println("Cache size: " + cache.size() + "/" + maxSize);
        System.out.println("Cache hits: " + hitCount);
        System.out.println("Cache misses: " + missCount);
        double hitRatio = hitCount + missCount > 0 ? (double) hitCount / (hitCount + missCount) * 100 : 0;
        System.out.printf("Hit ratio: %.2f%%\n", hitRatio);
        System.out.println("========================");
    }
}

// Example 6: Singleton with Clone prevention
class SecureSingleton implements Cloneable {
    private static SecureSingleton instance;
    private String secretData;
    
    private SecureSingleton() {
        System.out.println("SecureSingleton: Constructor called");
        this.secretData = "Top Secret Information";
        
        // Prevent reflection-based instantiation
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create instance");
        }
    }
    
    public static synchronized SecureSingleton getInstance() {
        if (instance == null) {
            instance = new SecureSingleton();
        }
        return instance;
    }
    
    // Prevent cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of singleton is not allowed");
    }
    
    // Prevent deserialization from creating new instance
    protected Object readResolve() {
        return instance;
    }
    
    public String getSecretData() {
        return secretData;
    }
    
    public void setSecretData(String data) {
        this.secretData = data;
    }
}

// Main class to demonstrate all singleton examples
public class Question9_Singleton {
    
    private static void demonstrateBasicSingleton() {
        System.out.println("=== BASIC SINGLETON - DATABASE MANAGER ===\n");
        
        // Try to create multiple instances
        DatabaseManager db1 = DatabaseManager.getInstance();
        db1.executeQuery("SELECT * FROM users");
        db1.showConnectionInfo();
        
        System.out.println();
        DatabaseManager db2 = DatabaseManager.getInstance();
        db2.executeQuery("SELECT * FROM products");
        db2.showConnectionInfo();
        
        // Check if both references point to the same instance
        System.out.println("db1 == db2: " + (db1 == db2));
        System.out.println("Same hashcode: " + (db1.hashCode() == db2.hashCode()));
    }
    
    private static void demonstrateThreadSafeSingleton() {
        System.out.println("\n=== THREAD-SAFE SINGLETON - LOGGER ===\n");
        
        Logger logger1 = Logger.getInstance();
        logger1.info("Application started");
        logger1.error("Sample error message");
        
        Logger logger2 = Logger.getInstance();
        logger2.debug("Debug information");
        logger2.setLogLevel("DEBUG");
        
        System.out.println("logger1 == logger2: " + (logger1 == logger2));
        logger1.showLogHistory();
    }
    
    private static void demonstrateEagerSingleton() {
        System.out.println("\n=== EAGER INITIALIZATION SINGLETON - CONFIGURATION ===\n");
        
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        config1.showAllProperties();
        
        config1.setProperty("new.feature", "enabled");
        
        ConfigurationManager config2 = ConfigurationManager.getInstance();
        System.out.println("New feature setting: " + config2.getProperty("new.feature"));
        
        System.out.println("config1 == config2: " + (config1 == config2));
    }
    
    private static void demonstrateStaticBlockSingleton() {
        System.out.println("\n=== STATIC BLOCK SINGLETON - CACHE MANAGER ===\n");
        
        CacheManager cache1 = CacheManager.getInstance();
        cache1.put("user1", "John Doe");
        cache1.put("user2", "Jane Smith");
        cache1.put("config", "production");
        
        // Test cache retrieval
        cache1.get("user1");  // Hit
        cache1.get("user3");  // Miss
        cache1.get("config"); // Hit
        
        CacheManager cache2 = CacheManager.getInstance();
        cache2.get("user2");  // Hit (same cache)
        
        System.out.println("cache1 == cache2: " + (cache1 == cache2));
        cache1.showCacheStatistics();
    }
    
    private static void demonstrateSecureSingleton() {
        System.out.println("\n=== SECURE SINGLETON - CLONE PREVENTION ===\n");
        
        SecureSingleton secure1 = SecureSingleton.getInstance();
        System.out.println("Secret data: " + secure1.getSecretData());
        
        SecureSingleton secure2 = SecureSingleton.getInstance();
        System.out.println("secure1 == secure2: " + (secure1 == secure2));
        
        // Try to clone (should fail)
        try {
            SecureSingleton cloned = (SecureSingleton) secure1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone prevention works: " + e.getMessage());
        }
        
        // Try reflection-based instantiation prevention
        try {
            java.lang.reflect.Constructor<SecureSingleton> constructor = 
                SecureSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            SecureSingleton reflected = constructor.newInstance();
        } catch (Exception e) {
            System.out.println("Reflection prevention works: " + e.getCause().getMessage());
        }
    }
    
    private static void demonstrateMultiThreadedAccess() {
        System.out.println("\n=== MULTI-THREADED SINGLETON ACCESS ===\n");
        
        // Create multiple threads trying to access singleton
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            Logger logger = Logger.getInstance();
            logger.info("Accessed from thread: " + threadName);
            System.out.println(threadName + " got logger instance: " + logger.hashCode());
        };
        
        // Create and start multiple threads
        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        Thread thread3 = new Thread(task, "Thread-3");
        
        thread1.start();
        thread2.start();
        thread3.start();
        
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        
        System.out.println("All threads completed accessing singleton");
    }
    
    private static void demonstrateSingletonComparison() {
        System.out.println("\n=== SINGLETON IMPLEMENTATION COMPARISON ===\n");
        
        System.out.println("1. LAZY INITIALIZATION (Basic Singleton):");
        System.out.println("   + Memory efficient (created only when needed)");
        System.out.println("   - Not thread-safe");
        System.out.println("   - Multiple instances possible in multithreaded environment");
        
        System.out.println("\n2. EAGER INITIALIZATION:");
        System.out.println("   + Thread-safe");
        System.out.println("   + Simple implementation");
        System.out.println("   - May waste memory if instance never used");
        System.out.println("   - No lazy loading");
        
        System.out.println("\n3. THREAD-SAFE LAZY INITIALIZATION:");
        System.out.println("   + Thread-safe");
        System.out.println("   + Lazy loading");
        System.out.println("   - Synchronized method reduces performance");
        
        System.out.println("\n4. DOUBLE-CHECKED LOCKING:");
        System.out.println("   + Thread-safe");
        System.out.println("   + Better performance than synchronized method");
        System.out.println("   + Lazy loading");
        System.out.println("   - Complex implementation");
        
        System.out.println("\n5. ENUM-BASED SINGLETON:");
        System.out.println("   + Inherently thread-safe");
        System.out.println("   + Prevents reflection attacks");
        System.out.println("   + Handles serialization automatically");
        System.out.println("   + Simple and clean");
        System.out.println("   - Less flexible (no lazy loading)");
        
        System.out.println("\n6. STATIC BLOCK INITIALIZATION:");
        System.out.println("   + Similar to eager initialization");
        System.out.println("   + Can handle exceptions during initialization");
        System.out.println("   - Same disadvantages as eager initialization");
    }
    
    // Class to demonstrate singleton breaking scenarios
    static class SingletonBreakingDemo {
        
        public static void demonstrateSerializationIssue() {
            System.out.println("\n=== SINGLETON SERIALIZATION ISSUE DEMO ===\n");
            System.out.println("Note: This is for educational purposes only");
            System.out.println("Proper singleton should implement readResolve() method");
            System.out.println("to prevent deserialization from creating new instances.");
        }
        
        public static void demonstrateReflectionIssue() {
            System.out.println("\n=== SINGLETON REFLECTION ISSUE DEMO ===\n");
            System.out.println("Reflection can break singleton pattern by:");
            System.out.println("1. Making private constructor accessible");
            System.out.println("2. Creating new instance directly");
            System.out.println("Prevention: Check if instance already exists in constructor");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("SINGLETON DESIGN PATTERN IN JAVA");
        System.out.println("=".repeat(70) + "\n");
        
        // Demonstrate different singleton implementations
        demonstrateBasicSingleton();
        demonstrateThreadSafeSingleton();
        demonstrateEagerSingleton();
        demonstrateEnumSingleton();
        demonstrateStaticBlockSingleton();
        demonstrateSecureSingleton();
        demonstrateMultiThreadedAccess();
        
        // Wait a moment for threads to complete
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        demonstrateSingletonComparison();
        
        SingletonBreakingDemo.demonstrateSerializationIssue();
        SingletonBreakingDemo.demonstrateReflectionIssue();
        
        System.out.println("\n" + "=".repeat(70));
        System.out.println("SINGLETON PATTERN SUMMARY");
        System.out.println("=".repeat(70));
        
        String[] keyPoints = {
            "DEFINITION: Ensures only one instance of a class exists",
            "PURPOSE: Global access point to a single instance",
            "STRUCTURE: Private constructor + Static instance + Static method",
            "USAGE: Database connections, loggers, caches, configurations",
            "BENEFITS: Controlled access, reduced memory usage, global state",
            "DRAWBACKS: Global state issues, testing difficulties, tight coupling"
        };
        
        for (String point : keyPoints) {
            System.out.println("• " + point);
        }
        
        System.out.println("\nIMPLEMENTATION TYPES DEMONSTRATED:");
        System.out.println("✓ Basic Lazy Initialization");
        System.out.println("✓ Thread-Safe with Double-Checked Locking");
        System.out.println("✓ Eager Initialization");
        System.out.println("✓ Enum-Based Singleton (Recommended)");
        System.out.println("✓ Static Block Initialization");
        System.out.println("✓ Secure Singleton with Attack Prevention");
        
        System.out.println("\nBEST PRACTICES:");
        System.out.println("✓ Use enum-based singleton for simple cases");
        System.out.println("✓ Use double-checked locking for complex lazy initialization");
        System.out.println("✓ Prevent cloning by overriding clone() method");
        System.out.println("✓ Implement readResolve() for serialization safety");
        System.out.println("✓ Prevent reflection attacks in constructor");
        System.out.println("✓ Consider using dependency injection instead of singleton");
        
        System.out.println("\n" + "=".repeat(70));
        System.out.println("RECOMMENDATION: Use Enum-based singleton for most cases");
        System.out.println("It's the simplest, most secure, and thread-safe approach!");
    }
}