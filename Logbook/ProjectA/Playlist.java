package Logbook.ProjectA;

import java.util.ArrayList;

public class Playlist {
    private final ArrayList<Song> songs;  // List to store songs

    // Constructor to initialize the playlist
    public Playlist() {
        songs = new ArrayList<>();
    }

    // Add a new song to the playlist
    public void addSong(Song song) {
        songs.add(song);
    }

    // Remove a song from the playlist by title
    public void removeSong(String title) {
        songs.removeIf(song -> song.getTitle().equalsIgnoreCase(title));
    }

    // Print all songs in the playlist
    public void printAllSongs() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the playlist.");
        } else {
            for (Song song : songs) {
                System.out.println(song);
            }
        }
    }

    // Print songs that have been played more than a given number of times
    public void printSongsAbovePlayCount(int playCount) {
        boolean found = false;
        for (Song song : songs) {
            if (song.getPlayCount() > playCount) {
                System.out.println(song);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No songs found with play count greater than " + playCount);
        }
    }
}