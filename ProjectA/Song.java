package ProjectA;

public class Song {
    private final String title;
    private final String artist;
    private final int playCount;

    // Constructor to initialize a new song
    public Song(String title, String artist, int playCount) {
        this.title = title;
        this.artist = artist;
        this.playCount = playCount;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for play count
    public int getPlayCount() {
        return playCount;
    }

    // Override the toString method to provide a more readable output
    @Override
    public String toString() {
        return "Song: " + title + " | Artist: " + artist + " | Play Count: " + playCount;
    }
}