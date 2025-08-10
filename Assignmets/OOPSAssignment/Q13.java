// 13. Write a Java program to create a class called "Inventory"
// with a collection of products and methods to add and remove products,
// and to check for low inventory.

import java.util.HashMap;

class Inventory {
    private HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String name, int quantity) {
        products.put(name, products.getOrDefault(name, 0) + quantity);
        System.out.println(quantity + " of " + name + " added.");
    }

    public void removeProduct(String name) {
        if (products.remove(name) != null) {
            System.out.println(name + " removed.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    public void checkLowInventory(int limit) {
        for (String name : products.keySet()) {
            if (products.get(name) < limit) {
                System.out.println(name + " is low in stock: " + products.get(name));
            }
        }
    }

    public void display() {
        System.out.println("Inventory: " + products);
    }
}

class TestMain {
    public static void main(String args[]) {
        Inventory inv = new Inventory();
        inv.addProduct("Apple", 5);
        inv.addProduct("Banana", 20);
        inv.display();
        inv.checkLowInventory(10);
        inv.removeProduct("Apple");
        inv.display();
    }
}
