abstract class Animal {
    String name; int age;
    Animal(String n, int a) { name = n; age = a; }
    abstract void eat();
    abstract void makeSound();
    void showInfo() { System.out.println(name + " - " + age + " years"); }
}

interface Flyable {
    void fly();
}

class Lion extends Animal { ... }
class Elephant extends Animal { ... }
class Parrot extends Animal implements Flyable { ... }
also the 