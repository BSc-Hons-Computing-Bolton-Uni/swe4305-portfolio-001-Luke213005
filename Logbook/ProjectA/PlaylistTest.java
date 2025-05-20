package Logbook.ProjectA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlaylistTest {

    private Playlist playlist;

    @BeforeEach
    void setUp() {
        playlist = new Playlist();
    }

    @Test
    void testAddSong() {
        Song song = new Song("Hope", "NF", 213700000);
        playlist.addSong(song);

        // Verify the song is added by checking the size
        assertEquals(1, playlist.getSongs().size(), "Playlist should contain 1 song after adding a song.");
    }

    @Test
    void testRemoveSong() {
        Song song = new Song("Hope", "NF", 213700000 );
        playlist.addSong(song);

        // Verify the size before removal
        int initialSize = playlist.getSongs().size();

        // Attempt to remove the song
        playlist.removeSong("Hope");

        // Verify the size after removal
        assertEquals(initialSize - 1, playlist.getSongs().size(), "Playlist should contain 0 songs after removing an existing song.");
    }

    @Test
    void testRemoveNonExistentSong() {
        playlist.addSong(new Song("Hope", "NF", 213700000));  // Add one song to the playlist

        System.out.println("Initial playlist size: " + playlist.getSongs().size());

        int initialSize = playlist.getSongs().size();
        playlist.removeSong("Non-existent Song");  // Attempt to remove a song that doesn't exist

        System.out.println("Playlist size after removal attempt: " + playlist.getSongs().size());

        // Verify that the playlist size remains unchanged
        assertEquals(initialSize, playlist.getSongs().size(), "Playlist should still contain 1 song after trying to remove a non-existent song.");
    }

    @Test
    void testPrintAllSongs() {
        playlist.addSong(new Song("Hope", "NF", 213700000));
        playlist.addSong(new Song("Iridescent", "Linkin Park", 132000000));

        playlist.printAllSongs(); // You will need to check the printed output manually
    }

    @Test
    void testPrintSongsAbovePlayCount() {
        playlist.addSong(new Song("Hope", "NF", 213700000));
        playlist.addSong(new Song("Iridescent", "Linkin Park", 132000000));

        // Verify that it correctly prints songs with a play count greater than 200
        playlist.printSongsAbovePlayCount(200);  // Should print "Song 2"
    }
}