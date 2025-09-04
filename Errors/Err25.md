**Day 25**.

---

# 📅 Day 25 – Errors in **File Handling & I/O (Streams, Readers, Writers, Serialization)**

Java I/O is one of the most **error-prone areas** because of checked exceptions, resource management, and data consistency issues. Today we’ll go deep.

---

## 🔹 1. FileNotFoundException

✅ Correct:

```java
import java.io.*;

class Test {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("file.txt");
    }
}
```

❌ Wrong:

```java
FileReader fr = new FileReader("nofile.txt"); // ❌ file missing
```

**Runtime Error:** `java.io.FileNotFoundException: nofile.txt (The system cannot find the file specified)`

👉 Always check file existence before reading.

---

## 🔹 2. Unhandled Checked Exception

❌ Wrong:

```java
FileReader fr = new FileReader("test.txt"); // ❌ must handle
```

**Error:** `unreported exception FileNotFoundException; must be caught or declared to be thrown`

✅ Fix → either `throws` or try-catch:

```java
try {
    FileReader fr = new FileReader("test.txt");
} catch (FileNotFoundException e) {
    e.printStackTrace();
}
```

---

## 🔹 3. Forgetting to Close Stream

```java
FileReader fr = new FileReader("test.txt");
// read file
// ❌ forgot fr.close();
```

👉 No compile error, but causes **resource leak** (open file handle remains).

✅ Use **try-with-resources**:

```java
try (FileReader fr = new FileReader("test.txt")) {
    // auto-close
}
```

---

## 🔹 4. Writing to Read-Only File

❌ Wrong:

```java
FileWriter fw = new FileWriter("readonly.txt");
fw.write("data"); // ❌ if OS permission denied
```

**Runtime Error:** `java.io.IOException: Access is denied`

👉 Always check file permissions.

---

## 🔹 5. Reading/Writing Binary as Text

❌ Wrong:

```java
FileWriter fw = new FileWriter("data.bin");
fw.write(65); // ❌ writes character, not raw byte
```

👉 Corrupts binary file.

✅ Use `FileOutputStream` for binary.

---

## 🔹 6. Serialization Errors

### (a) Class Not Serializable

```java
import java.io.*;

class User {
    int id;
}

class Test {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("u.ser"));
        oos.writeObject(new User()); // ❌
    }
}
```

**Runtime Error:** `java.io.NotSerializableException: User`

👉 Fix: implement `Serializable`:

```java
class User implements Serializable { int id; }
```

---

### (b) Serial Version UID Mismatch

If a class changes after serialization →

```java
InvalidClassException: local class incompatible
```

👉 Always define:

```java
private static final long serialVersionUID = 1L;
```

---

## 🔹 7. Buffer Misuse

❌ Wrong:

```java
BufferedReader br = new BufferedReader(new FileReader("test.txt"));
String line = br.readLine();
br.close();
System.out.println(br.readLine()); // ❌ already closed
```

**Runtime Error:** `java.io.IOException: Stream closed`

---

## 🔹 8. Directory vs File Confusion

❌ Wrong:

```java
File f = new File("C:/Users");
FileReader fr = new FileReader(f); // ❌ if f is directory
```

**Runtime Error:** `java.io.FileNotFoundException: (Is a directory)`

---

## 🔹 9. EOF Handling

❌ Wrong:

```java
FileInputStream fis = new FileInputStream("test.txt");
int c;
while ((c = fis.read()) != -1) {
    // read ok
}
System.out.println(fis.read()); // ❌ read after EOF
```

👉 Returns `-1`, no exception, but logical error if ignored.

---

## 🔹 10. Common Mistakes in File Paths

- Using backslashes incorrectly:

```java
FileReader fr = new FileReader("C:\test.txt"); // ❌ error
```

**Error:** `illegal escape character`

✅ Use double slash:

```java
new FileReader("C:\\test.txt");
```

Or use forward slash:

```java
new FileReader("C:/test.txt");
```

---

## 🔹 11. Key Takeaways

- Always handle `FileNotFoundException` & `IOException`.
- Use `try-with-resources` to prevent leaks.
- Permissions can cause runtime errors.
- Use proper stream (character vs byte).
- Serialization requires `implements Serializable`.
- Don’t use closed streams.
- Be careful with file paths & directories.

---

✅ **Day 25 complete** – You’ve covered **all common File Handling & I/O errors** in Java.
