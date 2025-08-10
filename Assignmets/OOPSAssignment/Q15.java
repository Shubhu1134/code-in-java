// 15. Write a Java program to create a class called "MusicLibrary"
// with a collection of songs and methods to add and remove songs,
// and to play a random song.

import java.util.ArrayList;
import java.util.Random;

class MusicLibrary {
    private ArrayList<String> songs = new ArrayList<>();
    private Random random = new Random();

    public void addSong(String song) {
        songs.add(song);
        System.out.println(song + " added to library.");
    }

    public void removeSong(String song) {
        if (songs.remove(song)) {
            System.out.println(song + " removed.");
        } else {
            System.out.println(song + " not found.");
        }
    }

    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs in library.");
        } else {
            String song = songs.get(random.nextInt(songs.size()));
            System.out.println("Playing: " + song);
        }
    }

    public void displaySongs() {
        System.out.println("Songs: " + songs);
    }
}

class TestMain {
    public static void main(String args[]) {
        MusicLibrary ml = new MusicLibrary();
        ml.addSong("Song A");
        ml.addSong("Song B");
        ml.displaySongs();
        ml.playRandomSong();
        ml.removeSong("Song A");
        ml.displaySongs();
    }
}
