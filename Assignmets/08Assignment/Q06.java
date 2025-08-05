class Movie {
    private String name;
    private String genre;
    private double rating;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // Method to check if the movie is a hit
    public boolean isHit() {
        return rating >= 8.0;
    }

    // Method to display movie info and hit status
    public void showMovieInfo() {
        System.out.println("Movie Name: " + name);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Hit Status: " + (isHit() ? "Hit" : "Flop"));
    }
}

public class Test {
    public static void main(String[] args) {
        Movie obj = new Movie();
        obj.setName("Inception");
        obj.setGenre("Sci-Fi");
        obj.setRating(8.8);

        obj.showMovieInfo();
    }
}