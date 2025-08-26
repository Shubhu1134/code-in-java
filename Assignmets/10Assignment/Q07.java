// Question7_Multiple_Constructors.java
// Can we make multiple constructors inside a class? If yes then what is the need of it? Explain.

/*
MULTIPLE CONSTRUCTORS IN A CLASS:

ANSWER: YES, we can have multiple constructors in a class. This is called CONSTRUCTOR OVERLOADING.

CONSTRUCTOR OVERLOADING RULES:
1. Multiple constructors must have different parameter lists (different number or types of parameters)
2. Constructors are differentiated by their parameter signatures
3. Return type is not considered (constructors don't have return types)
4. Access modifiers can be different for different constructors

NEED FOR MULTIPLE CONSTRUCTORS:

1. FLEXIBILITY: Allows creating objects in different ways based on available information
2. DEFAULT VALUES: Some constructors can provide default values for missing parameters
3. CONVENIENCE: Users can choose the most convenient way to create objects
4. DIFFERENT INITIALIZATION SCENARIOS: Different constructors for different use cases
5. OPTIONAL PARAMETERS: Simulate optional parameters (Java doesn't have native optional parameters)
6. VALIDATION: Different constructors can have different validation rules
7. BACKWARDS COMPATIBILITY: Add new constructors without breaking existing code
8. CODE REUSABILITY: Constructors can call other constructors using this()
*/