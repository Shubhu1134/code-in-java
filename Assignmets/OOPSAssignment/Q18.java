// 18. Write a Java program to create a class called "Restaurant"
// with attributes for menu items, prices, and ratings,
// and methods to add and remove items, and to calculate average rating.

import java.util.HashMap;
import java.util.ArrayList;

class Restaurant {
    private HashMap<String, Double> menu = new HashMap<>();
    private ArrayList<Integer> ratings = new ArrayList<>();

    public void addItem(String name, double price) {
        menu.put(name, price);
        System.out.println(name + " added at price " + price);
    }
    public void removeItem(String name) {
        if (menu.remove(name) != null) {
            System.out.println(name + " removed.");
        } else {
            System.out.println(name + " not found.");
        }
    }
    public void addRating(int rating) {
        ratings.add(rating);
    }
    public double getAverageRating() {
        if (ratings.isEmpty()) return 0;
        int sum = 0;
        for (int r : ratings) sum += r;
        return (double) sum / ratings.size();
    }
    public void display() {
        System.out.println("Menu: " + menu);
        System.out.println("Average Rating: " + getAverageRating());
    }
}

class TestMain {
    public static void main(String args[]) {
        Restaurant r = new Restaurant();
        r.addItem("Pizza", 12.5);
        r.addItem("Burger", 8.0);
        r.addRating(5);
        r.addRating(4);
        r.display();
        r.removeItem("Pizza");
        r.display();
    }
}
