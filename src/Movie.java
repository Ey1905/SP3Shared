public class Movie {
    private String title;
    private String genre;
    private double length;

    public Movie(String title, String genre, double length) {
        this.title = title;
        this.genre = genre;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getLength() {
        return length;
    }
}
