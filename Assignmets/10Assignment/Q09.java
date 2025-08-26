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
