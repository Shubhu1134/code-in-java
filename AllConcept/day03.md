# 30 Days Java Mastery - Day 3: Arrays and Methods

## 🎯 Today's Learning Goals

- Master array declaration, initialization, and manipulation
- Understand multi-dimensional arrays
- Learn method definition, calling, and parameter passing
- Explore method overloading and variable arguments
- Practice array algorithms and method design
- Understand memory management with arrays and methods

---

## 1. Array Fundamentals

### What is an Array?

An array is a **collection of elements of the same data type** stored in contiguous memory locations. Each element is accessed using an **index** (starting from 0).

```java
// Array visualization
// Index:   0    1    2    3    4
// Array: [10] [20] [30] [40] [50]
//         ↑                    ↑
//      First element      Last element
```

### Array Declaration and Creation

```java
public class ArrayBasics {
    public static void main(String[] args) {
        // Method 1: Declaration then initialization
        int[] numbers;              // Declaration
        numbers = new int[5];       // Creation with size 5

        // Method 2: Declaration and creation together
        int[] scores = new int[10]; // Array of 10 integers (default value: 0)

        // Method 3: Declaration with initialization
        int[] grades = {85, 92, 78, 96, 88}; // Array literal

        // Method 4: Using new with initialization
        String[] names = new String[]{"Alice", "Bob", "Charlie"};

        // Alternative syntax (C-style, but Java-style preferred)
        int marks[] = new int[5];   // Valid but less preferred

        // Array properties
        System.out.println("Grades array length: " + grades.length);
        System.out.println("Names array length: " + names.length);

        // Accessing elements
        System.out.println("First grade: " + grades[0]);        // 85
        System.out.println("Last grade: " + grades[4]);         // 88
        // System.out.println(grades[5]);                       // ArrayIndexOutOfBoundsException!

        // Modifying elements
        grades[2] = 82; // Change third element from 78 to 82
        System.out.println("Modified third grade: " + grades[2]);
    }
}
```

---

## 2. Array Operations and Algorithms

### Basic Array Operations

```java
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array from user
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Display array
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Enhanced for loop (for-each)
        System.out.print("Using enhanced for loop: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Array statistics
        int sum = 0;
        int max = arr[0];
        int min = arr[0];

        for (int element : arr) {
            sum += element;
            if (element > max) max = element;
            if (element < min) min = element;
        }

        double average = (double) sum / arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Using Arrays utility class
        System.out.println("Array as string: " + Arrays.toString(arr));

        // Copy array
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied array: " + Arrays.toString(copy));

        scanner.close();
    }
}
```

### Array Searching and Sorting

```java
import java.util.Arrays;

public class ArrayAlgorithms {
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90, 88, 76, 50};

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Linear Search
        int target = 22;
        int position = linearSearch(numbers, target);
        if (position != -1) {
            System.out.println("Linear Search: " + target + " found at index " + position);
        } else {
            System.out.println("Linear Search: " + target + " not found");
        }

        // Bubble Sort (simple sorting algorithm)
        int[] sortedArray = bubbleSort(Arrays.copyOf(numbers, numbers.length));
        System.out.println("After Bubble Sort: " + Arrays.toString(sortedArray));

        // Binary Search (requires sorted array)
        int binaryPosition = binarySearch(sortedArray, target);
        if (binaryPosition != -1) {
            System.out.println("Binary Search: " + target + " found at index " + binaryPosition);
        }

        // Using built-in methods
        int[] builtInSorted = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(builtInSorted);
        System.out.println("Built-in sort: " + Arrays.toString(builtInSorted));

        int builtInSearch = Arrays.binarySearch(builtInSorted, target);
        System.out.println("Built-in binary search result: " + builtInSearch);
    }

    // Linear Search Implementation
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }

    // Bubble Sort Implementation
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Binary Search Implementation (for sorted arrays)
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return -1; // Not found
    }
}
```

---

## 3. Multi-Dimensional Arrays

### 2D Arrays (Matrix)

```java
public class TwoDimensionalArrays {
    public static void main(String[] args) {
        // Declaration and initialization methods

        // Method 1: Declaration then initialization
        int[][] matrix1 = new int[3][4]; // 3 rows, 4 columns

        // Method 2: Array literal
        int[][] matrix2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Method 3: Row by row initialization
        int[][] matrix3 = new int[2][];
        matrix3[0] = new int[3]; // First row has 3 columns
        matrix3[1] = new int[4]; // Second row has 4 columns (jagged array)

        // Accessing elements
        System.out.println("Element at [1][2]: " + matrix2[1][2]); // 7

        // Matrix dimensions
        System.out.println("Rows: " + matrix2.length);              // 3
        System.out.println("Columns in row 0: " + matrix2[0].length); // 4

        // Filling matrix with values
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = (i + 1) * (j + 1);
            }
        }

        // Displaying matrix
        System.out.println("Matrix1:");
        displayMatrix(matrix1);

        System.out.println("Matrix2:");
        displayMatrix(matrix2);

        // Matrix operations
        int[][] sum = addMatrices(matrix1, matrix2);
        System.out.println("Sum of matrices:");
        displayMatrix(sum);

        // Transpose
        int[][] transpose = transposeMatrix(matrix2);
        System.out.println("Transpose of matrix2:");
        displayMatrix(transpose);
    }

    // Method to display matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            System.out.println("Matrices dimensions don't match!");
            return null;
        }

        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to transpose matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
```

### Jagged Arrays

```java
public class JaggedArrays {
    public static void main(String[] args) {
        // Jagged array - each row can have different number of columns
        int[][] jaggedArray = new int[4][];

        // Initialize each row with different sizes
        jaggedArray[0] = new int[1];    // Row 0: 1 element
        jaggedArray[1] = new int[2];    // Row 1: 2 elements
        jaggedArray[2] = new int[3];    // Row 2: 3 elements
        jaggedArray[3] = new int[4];    // Row 3: 4 elements

        // Fill with values
        int value = 1;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = value++;
            }
        }

        // Display jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // Pascal's Triangle using jagged array
        System.out.println("\nPascal's Triangle:");
        int[][] pascal = generatePascalTriangle(6);
        displayPascalTriangle(pascal);
    }

    public static int[][] generatePascalTriangle(int rows) {
        int[][] triangle = new int[rows][];

        for (int i = 0; i < rows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; // First element is always 1
            triangle[i][i] = 1; // Last element is always 1

            // Fill middle elements
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }

        return triangle;
    }

    public static void displayPascalTriangle(int[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            // Print spaces for formatting
            for (int k = 0; k < triangle.length - i - 1; k++) {
                System.out.print(" ");
            }

            // Print triangle elements
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

## 4. Methods (Functions) Fundamentals

### Method Definition and Structure

```java
public class MethodBasics {
    public static void main(String[] args) {
        // Method calls
        greetUser();                           // No parameters, no return
        greetUser("Alice");                    // One parameter, no return

        int sum = addNumbers(10, 20);          // Parameters with return
        System.out.println("Sum: " + sum);

        double area = calculateCircleArea(5.0);
        System.out.println("Circle area: " + area);

        // Method with multiple parameters
        displayPersonInfo("Bob", 25, "Engineer");

        // Method returning boolean
        boolean isEven = checkEven(42);
        System.out.println("42 is even: " + isEven);
    }

    // Method with no parameters, no return value
    public static void greetUser() {
        System.out.println("Hello, welcome to Java programming!");
    }

    // Method with parameter, no return value
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java programming!");
    }

    // Method with parameters and return value
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum; // Return statement
    }

    // Method with double parameter and return
    public static double calculateCircleArea(double radius) {
        final double PI = 3.14159;
        return PI * radius * radius;
    }

    // Method with multiple parameters
    public static void displayPersonInfo(String name, int age, String profession) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Profession: " + profession);
        System.out.println("---");
    }

    // Method returning boolean
    public static boolean checkEven(int number) {
        return number % 2 == 0;
    }
}
```

### Method Components Breakdown

```java
/*
Method Signature Components:

[access_modifier] [static] return_type method_name(parameter_list) {
    // Method body
    [return statement;] // if return_type is not void
}

Examples:
*/

public class MethodComponents {

    // 1. Access Modifier: public, private, protected, package-private
    public static void publicMethod() { }        // Accessible from anywhere
    private static void privateMethod() { }      // Accessible within same class only
    protected static void protectedMethod() { }  // Accessible within package and subclasses
    static void packageMethod() { }              // Accessible within same package

    // 2. Static keyword: method belongs to class, not instance
    public static void staticMethod() { }        // Called with: ClassName.staticMethod()
    public void instanceMethod() { }             // Called with: objectName.instanceMethod()

    // 3. Return Types
    public static void voidMethod() { }          // Returns nothing
    public static int intMethod() { return 42; } // Returns integer
    public static String stringMethod() { return "Hello"; } // Returns String
    public static boolean booleanMethod() { return true; }  // Returns boolean
    public static double[] arrayMethod() { return new double[5]; } // Returns array

    // 4. Method Name: follows camelCase convention
    public static void calculateTotalSalary() { }     // Good naming
    public static void processUserInput() { }         // Good naming

    // 5. Parameter List
    public static void noParams() { }                           // No parameters
    public static void oneParam(int x) { }                      // One parameter
    public static void multipleParams(int x, String y, boolean z) { } // Multiple parameters
    public static void arrayParam(int[] arr) { }                // Array parameter
}
```

---

## 5. Parameter Passing and Method Overloading

### Parameter Passing Mechanisms

```java
public class ParameterPassing {
    public static void main(String[] args) {
        // Pass by Value for Primitives
        int originalNumber = 100;
        System.out.println("Before method call: " + originalNumber);

        modifyPrimitive(originalNumber);
        System.out.println("After method call: " + originalNumber); // Still 100

        // Pass by Reference for Objects (including arrays)
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Before method call: " + java.util.Arrays.toString(originalArray));

        modifyArray(originalArray);
        System.out.println("After method call: " + java.util.Arrays.toString(originalArray));
        // Array is modified!

        // String behavior (immutable object)
        String originalString = "Hello";
        System.out.println("Before method call: " + originalString);

        modifyString(originalString);
        System.out.println("After method call: " + originalString); // Still "Hello"

        // But we can return modified values
        String newString = modifyAndReturnString(originalString);
        System.out.println("Returned string: " + newString);
    }

    // Primitive parameters are passed by value (copy)
    public static void modifyPrimitive(int number) {
        number = number * 2;
        System.out.println("Inside method: " + number);
    }

    // Array parameters are passed by reference
    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        System.out.println("Inside method: " + java.util.Arrays.toString(arr));
    }

    // String is immutable, so changes don't affect original
    public static void modifyString(String str) {
        str = str + " World";
        System.out.println("Inside method: " + str);
    }

    // Return modified string
    public static String modifyAndReturnString(String str) {
        return str + " World";
    }
}
```

### Method Overloading

```java
public class MethodOverloading {
    public static void main(String[] args) {
        // Different methods with same name but different parameters

        System.out.println("Add two integers: " + add(5, 3));
        System.out.println("Add three integers: " + add(5, 3, 2));
        System.out.println("Add two doubles: " + add(5.5, 3.3));
        System.out.println("Add two strings: " + add("Hello", "World"));

        // Different display methods
        display(42);
        display(3.14);
        display("Java Programming");
        display(new int[]{1, 2, 3, 4, 5});

        // Area calculations for different shapes
        System.out.println("Square area: " + calculateArea(5.0));
        System.out.println("Rectangle area: " + calculateArea(5.0, 3.0));
        System.out.println("Triangle area: " + calculateArea(5.0, 3.0, "triangle"));
    }

    // Overloaded add methods - same name, different parameters
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + " " + b;
    }

    // Overloaded display methods
    public static void display(int value) {
        System.out.println("Integer value: " + value);
    }

    public static void display(double value) {
        System.out.println("Double value: " + value);
    }

    public static void display(String value) {
        System.out.println("String value: " + value);
    }

    public static void display(int[] array) {
        System.out.print("Array values: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Overloaded area calculation methods
    public static double calculateArea(double side) { // Square
        return side * side;
    }

    public static double calculateArea(double length, double width) { // Rectangle
        return length * width;
    }

    public static double calculateArea(double base, double height, String shape) { // Triangle
        if (shape.equalsIgnoreCase("triangle")) {
            return 0.5 * base * height;
        }
        return 0;
    }
}
```

---

## 6. Variable Arguments (Varargs)

### Using Varargs

```java
public class VarArgs {
    public static void main(String[] args) {
        // Variable number of arguments
        System.out.println("Sum of 2 numbers: " + sum(10, 20));
        System.out.println("Sum of 4 numbers: " + sum(10, 20, 30, 40));
        System.out.println("Sum of 6 numbers: " + sum(1, 2, 3, 4, 5, 6));

        // No arguments
        System.out.println("Sum of no numbers: " + sum());

        // Mixed parameters
        displayInfo("Alice", 25, "Engineer", "Manager", "Team Lead");

        // Array can be passed to varargs method
        int[] numbers = {5, 10, 15, 20, 25};
        System.out.println("Sum using array: " + sum(numbers));
    }

    // Varargs method - accepts variable number of int arguments
    public static int sum(int... numbers) { // int... is varargs syntax
        int total = 0;

        // numbers is treated as an array inside the method
        System.out.println("Received " + numbers.length + " arguments");

        for (int num : numbers) {
            total += num;
        }

        return total;
    }

    // Varargs with other parameters (varargs must be last)
    public static void displayInfo(String name, int age, String... roles) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.print("Roles: ");

        if (roles.length == 0) {
            System.out.println("No roles specified");
        } else {
            for (int i = 0; i < roles.length; i++) {
                System.out.print(roles[i]);
                if (i < roles.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        System.out.println("---");
    }

    // Multiple overloaded methods with varargs
    public static void printValues(String... values) {
        System.out.print("String values: ");
        for (String value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printValues(int... values) {
        System.out.print("Integer values: ");
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
```

---

## 7. Array and Method Utility Examples

### Array Utility Methods

```java
import java.util.Arrays;
import java.util.Random;

public class ArrayUtilities {
    public static void main(String[] args) {
        // Test array utility methods
        int[] arr1 = {5, 2, 8, 1, 9, 3};
        System.out.println("Original array: " + Arrays.toString(arr1));

        // Find maximum and minimum
        System.out.println("Maximum: " + findMax(arr1));
        System.out.println("Minimum: " + findMin(arr1));

        // Reverse array
        int[] reversed = reverseArray(Arrays.copyOf(arr1, arr1.length));
        System.out.println("Reversed: " + Arrays.toString(reversed));

        // Check if array is sorted
        System.out.println("Is original sorted: " + isSorted(arr1));
        Arrays.sort(arr1);
        System.out.println("After sorting: " + Arrays.toString(arr1));
        System.out.println("Is now sorted: " + isSorted(arr1));

        // Generate random array
        int[] randomArray = generateRandomArray(10, 1, 100);
        System.out.println("Random array: " + Arrays.toString(randomArray));

        // Remove duplicates
        int[] withDuplicates = {1, 2, 2, 3, 4, 4, 5, 5, 6};
        int[] unique = removeDuplicates(withDuplicates);
        System.out.println("With duplicates: " + Arrays.toString(withDuplicates));
        System.out.println("Without duplicates: " + Arrays.toString(unique));

        // Merge two arrays
        int[] arr2 = {10, 20, 30};
        int[] arr3 = {40, 50, 60};
        int[] merged = mergeArrays(arr2, arr3);
        System.out.println("Merged arrays: " + Arrays.toString(merged));
    }

    // Find maximum element in array
    public static int findMax(int[] arr) {
        if (arr.length == 0) return Integer.MIN_VALUE;

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Find minimum element in array
    public static int findMin(int[] arr) {
        if (arr.length == 0) return Integer.MAX_VALUE;

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Reverse array elements
    public static int[] reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }

    // Check if array is sorted in ascending order
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Generate random array
    public static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(max - min + 1) + min;
        }

        return arr;
    }

    // Remove duplicates from sorted array
    public static int[] removeDuplicates(int[] arr) {
        if (arr.length == 0) return arr;

        // Count unique elements
        int uniqueCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueCount++;
            }
        }

        // Create array with unique elements
        int[] unique = new int[uniqueCount];
        unique[0] = arr[0];
        int index = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                unique[index++] = arr[i];
            }
        }

        return unique;
    }

    // Merge two arrays
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];

        // Copy first array
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Copy second array
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        return merged;
    }
}
```

---

## 8. Practice Exercises for Day 3

### Exercise 1: Student Grade Management System

```java
import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        //
```
