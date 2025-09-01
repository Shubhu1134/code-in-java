### Part 1: Basics of Java Environment and Entry Point (Questions 1-14)

1. **What do you mean by JDK, JVM, and JRE?**  
   In simple terms, JDK (Java Development Kit) is like a full toolbox for building Java programs—it includes tools to write, compile, and run code, plus the JRE. JRE (Java Runtime Environment) is the basic setup needed to run Java programs, providing libraries and the JVM. JVM (Java Virtual Machine) is the engine that runs your Java code step by step, like an interpreter turning instructions into actions on your computer.

2. **Explain public static void main(String args[]) and why main method is public in Java?**  
   This is the starting point of any Java program. "Public" means it can be accessed from anywhere, even outside its package, so the JVM can call it to start the app. "Static" lets it run without creating an object. "Void" means it doesn't return anything. "Main" is the method name. "String args[]" is an array to pass inputs from the command line, like arguments when launching the program.

3. **Why main method is static? Can we call static method with Object? Is JVM call main method either with class or with Object?**  
   It's static so the JVM can run it without creating an instance of the class—saves time and memory at startup. Yes, you can call a static method using an object, but it's not necessary. The JVM calls it using the class name, not an object, for efficiency.

4. **If we can call the static method with the object then why JVM does not call the static with the object?**  
   The JVM avoids using an object to call main because it would waste memory by creating an unnecessary instance. Static methods are tied to the class, so calling via class is direct and efficient.

5. **Explain System.out.println(), System.out.print(), System.out.printf(), System.err.println().**  
   "System" is a built-in class for input/output. "Out" is a static object for standard output (like printing to screen). "Println()" prints text and adds a new line. "Print()" prints without a new line. "Printf()" formats text like in C (e.g., with placeholders). "Err" is for error output, often in red, used for warnings or errors.

6. **Why Java introduce byte datatype? Why Java character datatype has 2 byte memory allocation?**  
   Byte is for tiny numbers (-128 to 127) to save memory in small data like network packets. Char uses 2 bytes because Java supports Unicode, which covers global characters (like emojis or non-English scripts), needing more space than 1 byte.

7. **What is the size of Boolean datatype in Java?**  
   Officially, it's 1 bit (true/false), but in memory, it might use 1 byte or more depending on the JVM for efficiency. Experts debate it, but practically, it's tiny and stores just true or false.

8. **What do you think, is Java either partially object oriented or purely object oriented? Justify your answer.**  
   Partially object-oriented because it allows primitive types (like int, boolean) that aren't objects, for speed and simplicity. Pure OO languages treat everything as objects.

9. **What is Object Oriented? What is need of Object Oriented in real time application development?**  
   OO is a way of programming where you model real-world things as "objects" with data and actions. It's needed in apps because it makes code reusable, organized, and easier to maintain—like building with Lego blocks instead of from scratch.

10. **Explain the Object oriented concept with real life example.**  
    OO concepts: Encapsulation (hiding details, like a car's engine under the hood), Inheritance (reusing code, like a sports car inheriting from a basic car), Polymorphism (same action different ways, like "drive" for car or bike), Abstraction (showing essentials, like a remote control hiding TV internals). Example: In a banking app, a "Account" object hides balance details (encapsulation) and inherits from "User" (inheritance).

11. **What is the difference between Encapsulation and Abstraction?**  
    Encapsulation is bundling data and methods together while hiding internals (like a capsule). Abstraction is showing only necessary features, ignoring details (like a TV remote abstracts complex circuits).

12. **What is POJO? Explain POJO with suitable example also tell the importance of setter & getter method.**  
    POJO (Plain Old Java Object) is a simple class without extra frameworks. Example: A "Person" class with name and age, plus getters/setters. Getters/setters are important for controlled access—getters read data safely, setters update it with validation, improving readability and reuse.

13. **What is constructor? Tell me the key points related with constructor.**  
    A constructor is a special method that runs when you create an object, initializing it. Key points: Same name as class, no return type, called automatically, can be overloaded, not static (tied to instances).

14. **Tell me, Is private constructor legal or illegal in Java?**  
    Legal. It's used in patterns like singletons to prevent direct creation, forcing use through methods.

### Part 2: Constructors, Keywords, and Static Concepts (Questions 15-28)

15. **Can we call constructor recursively in Java?**  
    No, direct recursion causes a stack overflow. Use loops or other methods instead.

16. **Is static modifier applicable on constructor in Java? If yes then why, if no then why.**  
    No, because constructors create instances, and static is for class-level (shared) things, not tied to instances.

17. **What is “this” in Java? Tell me the key points related with “this” keyword in Java?**  
    "This" refers to the current object. Key points: Used to access instance variables, call other constructors (this()), or pass the object as argument. Helps distinguish local vs. instance variables.

18. **How many reserved literal available in Java and also explain their importance.**  
    Three: true, false (for booleans), null (for no value). Important for logic (true/false) and indicating absence (null) without creating objects.

19. **Explain static data member, static method, static block and static class in Java.**  
    Static member: Shared across all objects, one copy. Static method: Called via class, no "this". Static block: Runs when class loads, for initialization. Static class: Only inner classes can be static, independent of outer instance.

20. **What is difference between instance member & static member.**  
    Instance: Per-object, personal data. Static: Shared by all objects, class-level.

21. **When instance variable & static variable allocate the memory in Java?**  
    Instance: When object is created (new keyword). Static: When class is loaded by JVM.

22. **Is there any code in Java which execute before the main method?**  
    Yes, static blocks run before main when the class loads.

23. **Can we define multiple static block in Java? If yes then what will be their execution order?**  
    Yes, they run in the order they appear in the code.

24. **What is singleton class in Java explain with suitable example.**  
    A class allowing only one instance, like a global manager. Example: public class Singleton { private static Singleton instance; private Singleton() {} public static Singleton getInstance() { if (instance == null) instance = new Singleton(); return instance; } }

25. **What is String? How many way to initialize the string in Java?**  
    String is text data, immutable. Ways: Literal ("Hello") or new String("Hello").

26. **What is difference between following two statement in Java? a) String s = “Hello”; b) String s = new String(“Hello”);**  
    a) Creates in string pool (shared, efficient). b) Creates in heap and pool, always new object.

27. **What do you mean mutability & immutability String in Java?**  
    Mutability: Changeable (like StringBuilder). Immutability: Unchangeable (String), safer for threads and hashing.

28. **What is difference between equal() method and == operator?**  
    equals(): Checks content equality. ==: Checks if same object (reference).

### Part 3: String Methods, Overloading, Arrays, and Inheritance (Questions 29-42)

29. **Explain the trim(), compareTo(), compareToIgnoreCase(), equals(), equalsIgnoreCase(), length(), intern method in Java.**  
    trim(): Removes leading/trailing spaces. compareTo(): Compares lexicographically (returns int). compareToIgnoreCase(): Same but case-insensitive. equals(): Content equal. equalsIgnoreCase(): Content equal ignoring case. length(): Char count. intern(): Adds to pool for reuse.

30. **String is difference between String, StringBuffer and StringBuilder in Java?**  
    String: Immutable, thread-safe. StringBuffer: Mutable, thread-safe (synchronized). StringBuilder: Mutable, faster but not thread-safe.

31. **What do you mean by method overloading in Java? Tell me the key point related with method overloading.**  
    Same method name, different parameters (types/count/order). Key: Compile-time, same class, improves readability.

32. **Can we overload static method in Java? Can we overload main method in Java?**  
    Yes to both. Main can be overloaded, but JVM calls the specific signature.

33. **What do you mean by array? In which scenario of application you would like to use array concept.**  
    Array: Fixed-size list of same-type items. Use when size is known, like storing scores in a game.

34. **What is difference between array & var-arg (…) notation in Java?**  
    Array: Fixed size, explicit declaration. Var-arg: Variable arguments, like array but flexible in methods.

35. **Can we use method overloading like behavior without implementing the method multiple times?**  
    No, overloading requires multiple definitions.

36. **Tell me the valid signature of defining of array in Java?**  
    int[] a = new int[5]; or int a[] = {1,2,3};

37. **Is array fixed in size?**  
    Yes, can't resize after creation.

38. **What do mean by Inheritance in Java? How many types of Inheritance supported by Java?**  
    Reusing parent class in child. Types: Single, multilevel, hierarchical (no multiple via classes).

39. **Why Java doesn’t support multiple inheritance.**  
    To avoid diamond problem—confusion if two parents have same method.

40. **What are advantage of inheritance in real time java application?**  
    Code reuse, like a "Vehicle" parent for "Car" and "Bike" in a transport app.

41. **Inheritance IS-A or HAS-A relationship? Explain HAS-A relationship with suitable example.**  
    IS-A (inheritance: Car IS-A Vehicle). HAS-A (composition: Car HAS-A Engine). Example: Class Car { Engine e = new Engine(); }

42. **What are execution order of constructor in case of Inheritance?**  
    Parent first, then child—ensures base is ready.

### Part 4: Super, This, Overriding, and Rules (Questions 43-56)

43. **Explain “super” and “super()” in Java?**  
    super: Access parent members. super(): Call parent constructor.

44. **Explain “this” and “this()” in Java?**  
    this: Current object. this(): Call another constructor in same class.

45. **What is method overriding in Java? Tell me the key point related with method overriding.**  
    Child redefines parent's method. Key: Runtime, same signature, inheritance.

46. **As a Java programmer when you like to override the method in Java?**  
    To customize behavior, like overriding "drive()" in a subclass for specific actions.

47. **Can we can change the access modifier while overriding the method in Java?**  
    Yes, but only to wider access (e.g., protected to public).

48. **Can we change the return type of the method while overriding it?**  
    Yes, if covariant (subclass type).

49. **What are the rule to be followed while overriding the method?**  
    Same name/signature, no narrower access, no new checked exceptions.

50. **Can we override the static Method?**  
    No, it's hiding, not overriding—static is class-bound.

51. **Can we override protected method of super class as a public method in sub class?**  
    Yes, widening access is allowed.

52. **Can we override super class method without throws clause as a method with throws clause in sub class.**  
    Yes, can add unchecked exceptions.

53. **Can we change an exception of a method with throws clause from SQLException to NumberFormatException while overriding it?**  
    Yes, as long as it's a subclass or same.

54. **Can we change a exception of a method with throws clause from unchecked exception to checked exception while overriding it?**  
    No, can't add new checked exceptions.

55. **How do you refer super class overridden method in the sub class?**  
    Using super.methodName().

56. **Can we override private method in java?**  
    No, private isn't visible to subclasses.

### Part 5: Overriding Edge Cases, Polymorphism, Abstract Classes (Questions 57-70)

57. **Can we override an exception of a method with throws clause from checked to unchecked while overriding it?**  
    Yes, unchecked are fine to add.

58. **Is it possible to override non-static method as a static method?**  
    No, changes binding type.

59. **What is difference between following two statement? a) Parent p = new Parent(); b) Child c = new Child();**  
    a) Parent reference, parent object—no polymorphism. b) Child reference, child object—access child specifics.

60. **In which scenario of application you would like to use Parent class reference variable holding child class object concept?**  
    For polymorphism, like a list of shapes where each is a circle or square at runtime.

61. **What is difference between Method Overloading and Method Overriding In Java? Or What is difference compile time polymorphism or runtime polymorphism?**  
    Overloading: Same name, different params (compile-time). Overriding: Same signature, different implementation (runtime).

62. **What is abstract class and abstract method in java? List down the key point related with abstract class and abstract method.**  
    Abstract class: Can't instantiate, for partial implementation. Abstract method: No body, must override. Key: Can have concrete methods, constructors; methods need "abstract".

63. **We can’t create the object of abstract class so can we define the instance variable and constructor in abstract class?**  
    Yes, subclasses use them.

64. **Is blank abstract class is possible in Java?**  
    Yes, since Java 8, but pointless without methods.

65. **What is interface in Java? Explain the real time utility of an interface?**  
    Blueprint for classes, all abstract methods. Utility: Standardize behavior, like "Drawable" for shapes in a graphics app.

66. **What is difference between jdk 1.7 interface and jdk 1.8 interface?**  
    1.7: Only abstract methods. 1.8: Adds default/static methods for evolution without breaking code.

67. **What is the difference between Abstract class and interface (jdk 1.8)?**  
    Abstract: Can have state, constructors. Interface: Constants, no state, multiple inheritance.

68. **Can we achieve the behavior of multiple inheritance with the help of interface in java?**  
    Yes, a class can implement multiple interfaces.

69. **How to declare interface, write a syntax?**  
    interface MyInterface { void method(); }

70. **Can we declare the interface as final in Java?**  
    No, interfaces are for extension.

### Part 6: Interfaces and Final Keyword (Questions 71-84)

71. **Which keywords java compiler add before the interface fields?**  
    public static final.

72. **Does interface extends Object class by default?**  
    No, but implementations do.

73. **Can we declare interface with final keyword?**  
    No, blocks implementation.

74. **After compilation of interface program, .class file will be generated for every interface in java. True or false?**  
    True, interfaces compile to .class.

75. **What is marker or tagged interface in java?**  
    Empty interface signaling behavior, like Serializable for serialization.

76. **Can we change the value of field in interface after initialization?**  
    No, fields are final.

77. **What is final keyword in java?**  
    Makes things unchangeable: variables constant, methods non-overridable, classes non-extendable.

78. **Where you can use final keyword in java?**  
    Variables, methods, classes—for constants, prevent overrides, seal classes.

79. **Can we change the value of final variable?**  
    No, once set.

80. **Can we use final keyword with the main method in java?**  
    Yes, but pointless as main isn't overridden.

81. **Can we override final method in java?**  
    No.

82. **What is static blank final variable. How to initialize static blank final variable in java?**  
    Final static without initial value. Initialize in static block.

83. **Can we inherit final method in sub-class?**  
    Yes, but can't override.

84. **What is difference between abstract method and final method in Java**  
    Abstract: Must override, no body. Final: Can't override, has body.

### Part 7: Keyword Combinations, Exceptions (Questions 85-98)

85. **Static & abstract can be used together? True or False?**  
    False, abstract needs instance, static doesn't.

86. **Static & final can be used together? True or False?**  
    True, like constants.

87. **Abstract and final keyword can be used together? True or False?**  
    False, abstract requires override, final prevents it.

88. **What is difference between final, finally and finalize?**  
    Final: Keyword for unchangeable. Finally: Block always runs after try/catch. Finalize: Method for cleanup before GC (deprecated).

89. **What is Exception? Explain the exception hierarchy.**  
    Error in runtime. Hierarchy: Throwable > Error (fatal) and Exception (handleable) > Checked (must handle) and Unchecked (runtime).

90. **What is difference between error and exception?**  
    Error: System issues (e.g., out of memory), hard to recover. Exception: Program issues, can handle.

91. **What is difference between checked exception and unchecked exception?**  
    Checked: Compiler forces handling (e.g., IOException). Unchecked: Runtime, optional (e.g., NullPointer).

92. **What is difference between throw and throws.**  
    Throw: Manually throw exception. Throws: Declare method may throw.

93. **Can we write try block without catch?**  
    Yes, with finally.

94. **Can we write try block without catch or finally?**  
    No, needs at least one.

95. **Can we write multiple catch block corresponding to single try block? If yes then what are the conditions for it?**  
    Yes, order: Specific to general exceptions.

96. **Can we handle more then one exception using single catch block? Explain with suitable example.**  
    Yes, catch (Exception1 | Exception2 e) {}. Example: catch (IOException | SQLException e) { log(e); }

97. **Can we throw the error and throwable object?**  
    Yes, but not recommended for Errors.

98. **Write a java program to create own custom exception class.**  
    class MyException extends Exception { MyException(String msg) { super(msg); } } Then: throw new MyException("Error");

### Part 8: Exceptions Continued, IO, Serialization, Multithreading (Questions 99-112)

99. **What is difference between final, finally, and finalize?**  
    (Repeated) Final: Unchangeable. Finally: Cleanup block. Finalize: GC hook.

100. **What is finally block? What is the use of finally block in Java application?**  
     Runs always after try/catch, for cleanup like closing files.

101. **Explain try with resource with suitable example.**  
     Auto-closes resources. Example: try (FileReader fr = new FileReader("file.txt")) { // use fr } // auto-close.

102. **Write all possible valid combination of try, catch and finally.**  
     try-catch, try-finally, try-catch-finally. Nested OK. Order: try first, catch specific to general, finally last.

103. **What is Byte-Stream, Character Stream, FileOutputStream and FileWriter?**  
     Byte: Handles raw bytes (e.g., images). Char: Handles text (Unicode). FileOutputStream: Byte output to file. FileWriter: Char output to file.

104. **What is Marker interface in java? How to serialize the object in java. Explain Serialization with suitable example.**  
     Empty interface like Serializable. Serialize: Implement Serializable, use ObjectOutputStream.writeObject(obj). Example: See user's answer, it's good.

105. **What is transient keyword? Can we serialize static data member in class?**  
     Transient: Skip in serialization. Static: Not serialized, class-level not object.

106. **What is MultiThreading? How many way to implement Thread in Java?**  
     Running multiple tasks concurrently. Ways: Extend Thread or implement Runnable.

107. **Difference between Thread class and Runnable Interface?**  
     Thread: Class, can't extend others. Runnable: Interface, allows extending other classes, shares object.

108. **What is the Default priority of a thread in Java?**  
     5 (NORM_PRIORITY).

109. **Explain the life cycle of thread with suitable example?**  
     New (created), Runnable (ready), Running (executing), Blocked/Waiting (paused), Terminated (done).

110. **Can we call run() method directly? Justify your answer.**  
     Yes, but runs in current thread, no new thread—loses multithreading benefit.

111. **What is run() method and why overriding of run() method is mandatory?**  
     Defines thread's task. Override to customize; default does nothing.

112. **Explain sleep(), setPriority() and Join() method.**  
     sleep(): Pause thread. setPriority(): Set importance (1-10). join(): Wait for thread to finish.

### Part 9: Synchronization, Deadlock, Collections Basics (Questions 113-126)

113. **Difference between synchronize method and synchronize block.**  
     Method: Locks whole method (object). Block: Locks specific code, more efficient.

114. **Which method force thread to release the lock in synchronized area. Explain Interthread communication with suitable example.**  
     wait() releases lock. Inter-thread: wait/notify for coordination, e.g., producer-consumer queue.

115. **Explain wait(), notify() and notifyAll() method in java**  
     wait(): Pause and release lock. notify(): Wake one waiting thread. notifyAll(): Wake all.

116. **What is deadlock? Explain with suitable example.**  
     Threads waiting forever for each other's locks. Example: Thread1 locks A waits B; Thread2 locks B waits A.

117. **What is daemon Thread in Java?**  
     Background thread (e.g., GC), exits when non-daemon threads finish.

118. **What is Collection? List down the 9 key interface in collection hierarchy?**  
     Framework for storing groups. Key: Collection, List, Set, SortedSet, Queue, Deque, Map, SortedMap, NavigableSet.

119. **What is difference between Collection and Collections.**  
     Collection: Interface. Collections: Utility class with methods like sort().

120. **What is difference between List and Set?**  
     List: Ordered, duplicates OK. Set: Unordered, unique.

121. **What is difference between ArrayList and LinkedList?**  
     ArrayList: Fast access, slow insert/delete. LinkedList: Slow access, fast insert/delete.

122. **What is difference between ArrayList and Vector**  
     ArrayList: Not synced, faster. Vector: Synced, slower.

123. **What is difference between Iterator and ListIterator?**  
     Iterator: Forward only, any collection. ListIterator: Bidirectional, lists only, add/remove/set.

124. **What is difference between HashSet and LinkedHashSet?**  
     HashSet: No order. LinkedHashSet: Insertion order.

125. **What do you mean by load-factor in HashSet?**  
     Ratio (0.75 default) when to resize for efficiency.

126. **How Set Collection internally manage data uniqueness.**  
     Uses HashMap keys (unique by hashCode/equals).

### Part 10: Collections Advanced, Loops, Examples (Questions 127-137)

127. **What is sortedSet and how sorted set internally manage the sorting.**  
     Set with sorted elements, uses TreeSet (red-black tree) for order.

128. **What is Default Natural Sorting order and Customized Sorting**  
     Natural: Comparable (e.g., numbers ascending). Custom: Comparator for specific rules.

129. **Difference Between Comparator and Comparable**  
     Comparable: In class, compareTo(). Comparator: Separate, compare(), multiple sorts.

130. **Can we add null value in HashSet, LinkedHashSet and TreeSet**  
     Hash/Linked: Yes, one null. Tree: No, needs comparison.

131. **Difference Between HashMap and LinkedHashMap?**  
     HashMap: No order. Linked: Insertion order.

132. **Difference between HashMap and Hashtable?**  
     HashMap: Not synced, null OK. Hashtable: Synced, no null.

133. **Is Map a collection? If yes then why it is not child of collection**  
     Yes, but not under Collection interface—separate for key-value.

134. **Can we add null key in HashMap, LinkedHashMap and TreeMap.**  
     Hash/Linked: Yes, one null key. Tree: No.

135. **Difference between for-each loop and Iterator?**  
     For-each: Simple, no remove. Iterator: Allows remove, more control.

136. **Prepare the programming example of hashCode, equals method**  
     class Person { String name; @Override public int hashCode() { return name.hashCode(); } @Override public boolean equals(Object o) { return name.equals(((Person)o).name); } }

137. **Prepare the programming example of Comparator and comparable. (Use userdefined class).**  
     Comparable: class Student implements Comparable<Student> { int age; public int compareTo(Student s) { return this.age - s.age; } } Comparator: class AgeComparator implements Comparator<Student> { public int compare(Student s1, Student s2) { return s1.age - s2.age; } }
