public class MediaLib {
    private Book book;
    private Movie movie;
    private Song song;
    
    private int numBooks = 0;
    private int numSongs = 0;
    private int numMovies = 0;

    private static String owner = "Student";

    public static String getOwner() {
        return owner;
    }

    public void addBook(Book b) {
        book = b;
        numBooks++;
    }

    public void addMovie(Movie m) {
        movie = m;
        numMovies++;
    }

    public void addSong(Song s) {
        song = s;
        numSongs++;
    }

    public int getNumBooks() {
        return numBooks;
    }

    public int getNumSongs() {
        return numSongs;
    }

    public int getNumMovies() {
        return numMovies;
    }

    public int getNumEntries() {
        return numBooks + numSongs + numMovies;
    }

    @Override
    public String toString() {
        String info = "";
        if (book != null) info += "Book: " + book + "\n";
        if (movie != null) info += "Movie: " + movie + "\n";
        if (song != null) info += "Song: " + song + "\n";
        return info;
    }
}
