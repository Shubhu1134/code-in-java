// 17. Write a Java program to create a class called "Movie"
// with attributes for title, director, actors, and reviews,
// and methods for adding and retrieving reviews.

import java.util.ArrayList;

class Movie {
    private String title;
    private String director;
    private ArrayList<String> actors = new ArrayList<>();
    private ArrayList<String> reviews = new ArrayList<>();

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }
    public void addActor(String actor) {
        actors.add(actor);
    }
    public void addReview(String review) {
        reviews.add(review);
    }
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors: " + actors);
        System.out.println("Reviews: " + reviews);
    }
}

class TestMain {
    public static void main(String args[]) {
        Movie m = new Movie("Inception", "Christopher Nolan");
        m.addActor("Leonardo DiCaprio");
        m.addActor("Joseph Gordon-Levitt");
        m.addReview("Excellent!");
        m.addReview("Mind-blowing");
        m.display();
    }
}
