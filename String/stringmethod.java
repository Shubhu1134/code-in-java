// AllStringMethods.java
// Demonstration of almost all commonly used String methods in Java

public class AllStringMethods {
    public static void main(String[] args) {

        String str = "Hello World";
        String str2 = "Java";
        String str3 = "   Trim me   ";

        System.out.println("==== LENGTH ====");
        System.out.println("length(): " + str.length());

        System.out.println("\n==== CHARACTER ACCESS ====");
        System.out.println("charAt(0): " + str.charAt(0));
        System.out.println("charAt(4): " + str.charAt(4));

        System.out.println("\n==== COMPARISON ====");
        System.out.println("equals(\"Hello World\"): " + str.equals("Hello World"));
        System.out.println("equalsIgnoreCase(\"hello world\"): " + str.equalsIgnoreCase("hello world"));
        System.out.println("compareTo(\"Hello World\"): " + str.compareTo("Hello World"));
        System.out.println("compareTo(\"Zebra\"): " + str.compareTo("Zebra"));
        System.out.println("compareToIgnoreCase(\"zebra\"): " + str.compareToIgnoreCase("zebra"));

        System.out.println("\n==== SEARCHING ====");
        System.out.println("contains(\"World\"): " + str.contains("World"));
        System.out.println("startsWith(\"Hello\"): " + str.startsWith("Hello"));
        System.out.println("endsWith(\"World\"): " + str.endsWith("World"));
        System.out.println("indexOf('o'): " + str.indexOf('o'));
        System.out.println("indexOf(\"World\"): " + str.indexOf("World"));
        System.out.println("lastIndexOf('o'): " + str.lastIndexOf('o'));
        System.out.println("lastIndexOf(\"l\"): " + str.lastIndexOf("l"));

        System.out.println("\n==== SUBSTRING ====");
        System.out.println("substring(6): " + str.substring(6));
        System.out.println("substring(0, 5): " + str.substring(0, 5));

        System.out.println("\n==== CASE CONVERSION ====");
        System.out.println("toUpperCase(): " + str.toUpperCase());
        System.out.println("toLowerCase(): " + str.toLowerCase());

        System.out.println("\n==== TRIM ====");
        System.out.println("trim(): \"" + str3.trim() + "\"");

        System.out.println("\n==== REPLACE ====");
        System.out.println("replace('l', 'x'): " + str.replace('l', 'x'));
        System.out.println("replace(\"World\", \"Java\"): " + str.replace("World", "Java"));
        System.out.println("replaceAll(\"o\", \"0\"): " + str.replaceAll("o", "0"));
        System.out.println("replaceFirst(\"l\", \"L\"): " + str.replaceFirst("l", "L"));

        System.out.println("\n==== SPLIT ====");
        String[] parts = str.split(" ");
        System.out.println("split(\" \"): ");
        for (String p : parts) {
            System.out.println(p);
        }

        System.out.println("\n==== VALUE OF & FORMAT ====");
        int num = 42;
        System.out.println("String.valueOf(42): " + String.valueOf(num));
        System.out.println("String.format: " + String.format("Hello %s, you are %d years old", "Alice", 25));

        System.out.println("\n==== IS EMPTY / IS BLANK ====");
        String empty = "";
        String blank = "   ";
        System.out.println("empty.isEmpty(): " + empty.isEmpty());
        System.out.println("blank.isBlank(): " + blank.isBlank());

        System.out.println("\n==== JOIN ====");
        String joined = String.join("-", "One", "Two", "Three");
        System.out.println("String.join: " + joined);

        System.out.println("\n==== REPEAT ====");
        System.out.println("\"Hi\".repeat(3): " + "Hi".repeat(3));

        System.out.println("\n==== STRIP (Java 11+) ====");
        System.out.println("\"   hello   \".strip(): \"" + "   hello   ".strip() + "\"");
        System.out.println("\"   hello   \".stripLeading(): \"" + "   hello   ".stripLeading() + "\"");
        System.out.println("\"   hello   \".stripTrailing(): \"" + "   hello   ".stripTrailing() + "\"");

        System.out.println("\n==== MATCHES ====");
        System.out.println("\"abc123\".matches(\"[a-z]+[0-9]+\"): " + "abc123".matches("[a-z]+[0-9]+"));

        System.out.println("\n==== TO CHAR ARRAY ====");
        char[] chars = str.toCharArray();
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("\n==== INTERN ====");
        String s1 = new String("Hello").intern();
        String s2 = "Hello";
        System.out.println("s1 == s2: " + (s1 == s2));

        System.out.println("\n==== GET CHARS ====");
        char[] buffer = new char[5];
        str.getChars(0, 5, buffer, 0);
        System.out.println("getChars(0,5): " + new String(buffer));

        System.out.println("\n==== CODE POINT METHODS ====");
        System.out.println("codePointAt(0): " + str.codePointAt(0));
        System.out.println("codePointBefore(1): " + str.codePointBefore(1));
        System.out.println("codePointCount(0,5): " + str.codePointCount(0, 5));
    }
}
