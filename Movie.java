public class Movie {
    private String title;
    private double duration;

    public Movie(String t, double d) {
        title = t;
        duration = d;
    }

    public String toString() {
        return title + " (" + duration + " hrs)";
    }
}
