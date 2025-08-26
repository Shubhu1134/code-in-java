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

