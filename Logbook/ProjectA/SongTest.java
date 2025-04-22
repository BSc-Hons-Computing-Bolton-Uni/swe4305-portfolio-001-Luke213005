package Logbook.ProjectA;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SongTest {

    @Test
    void testSongCreation() {
        Song song = new Song("Hope", "NF", 213700000);
        assertEquals("Hope", song.getTitle(), "Title should be 'Hope'");
        assertEquals(213700000, song.getPlayCount(), "Play count should be 213700000");
    }

    @Test
    void testToString() {
        Song song = new Song("Hope", "NF", 213700000);
        String expected = "Song: Hope | Artist: NF | Play Count: 213700000";
        assertEquals(expected, song.toString(), "toString() method should return the correct format");
    }
}
