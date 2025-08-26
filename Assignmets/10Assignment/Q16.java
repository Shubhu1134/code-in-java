class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person(String name) {
        this(name, 18); // default age
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Ravi");
        Person p2 = new Person("Sita", 25);
        p1.display(); p2.display();
    }
}
