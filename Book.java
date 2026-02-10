public class Book {
    private String title;
    private String author;
    private int rating;

    public Book(String t, String a) {
        title = t;
        author = a;
        rating = 0;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void adjustRating(int r) {
        if ((this.rating + r >= 0) && (this.rating + r <= 10)) {
            this.rating += r;
        }
    }

    public String toString() {
        return "\"" + title + "\", written by " + author;
    }
}
