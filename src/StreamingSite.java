import java.util.ArrayList;

public class StreamingSite {
    private String titleName;
    private ArrayList<User> users;
    private ArrayList<Movie> movies;

    public StreamingSite(String titleName, ArrayList<User> users, ArrayList<Movie> movies) {
        this.titleName = titleName;
        this.users = new ArrayList<>();
        this.movies = new ArrayList<>();
    }
}
