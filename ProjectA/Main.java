package ProjectA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = new Playlist();

        // Sample data (add your own songs here)
        playlist.addSong(new Song("Better Off (Alone),Pt. III", "Alan Walker, Dash Berlin and Vickstar", 133800000));
        playlist.addSong(new Song("Hope", "NF", 213700000));
        playlist.addSong(new Song("Iridescent", "Linkin Park", 132000000));
        playlist.addSong(new Song("Gravity", "Martin Garrix, Sem Vox, Jaimes", 9900000));
        playlist.addSong(new Song("Good Without", "Mimi Webb", 58000000));
        playlist.addSong(new Song("Without You", "Avicii, Sandro Cavazza", 1200000000));
        playlist.addSong(new Song("Popular Monster", "Falling In Reverse", 418000000));
        playlist.addSong(new Song("Bad Life", "Sigrid, Bring Me The Horizon", 49700000));
        playlist.addSong(new Song("Ellen", "Charlotte Plank", 374896));
        playlist.addSong(new Song("Circles", "Post Malone", 2000000000));

        boolean running = true;

        // Start the menu loop
        while (running) {
            System.out.println("\n--- Music Playlist ---");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Print All Songs");
            System.out.println("4. Print Songs Over a Given Play Count");
            System.out.println("5. Exit");

            System.out.print("Please select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    // Add a new song
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist name: ");
                    String artist = scanner.nextLine();
                    System.out.print("Enter play count: ");
                    int playCount = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                    playlist.addSong(new Song(title, artist, playCount));
                    System.out.println("Song added successfully!");
                    break;

                case 2:
                    // Remove a song by title
                    System.out.print("Enter the song title to remove: ");
                    String songToRemove = scanner.nextLine();
                    playlist.removeSong(songToRemove);
                    System.out.println("Song removed (if it existed)!");
                    break;

                case 3:
                    // Print all songs in the playlist
                    System.out.println("\n--- All Songs in Playlist ---");
                    playlist.printAllSongs();
                    break;

                case 4:
                    // Print songs with more than a given play count
                    System.out.print("Enter the minimum play count: ");
                    int minPlayCount = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                    System.out.println("\n--- Songs with More Than " + minPlayCount + " Plays ---");
                    playlist.printSongsAbovePlayCount(minPlayCount);
                    break;

                case 5:
                    // Exit the program
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
