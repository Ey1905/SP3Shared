import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private ArrayList<Movie> watchList;
    private ArrayList<Movie> watchHistory;

    public User(String name, String password){
        this.username = username;
        this.password = password;
        this.watchList = new ArrayList<>();
        this.watchHistory = new ArrayList<>();


    }

    //For at tilføje film til WatchListen:
    public void addToWatchList(Movie movie) {
        //if sætningen kontrolere om filmen alleree findes i listen, så den ikke bliver gentaget
        if (!watchList.contains(movie)) {
            watchList.add(movie); //Filmen bliver tilføjet
            //Printer besked til brugeren
            System.out.println(movie.getTitle() + " Is added to your WatchList "); //Printes ud når den er tilføjet
        } else {
            System.out.println(movie.getTitle() + " already exists in your WatchList "); //Printes ud hvis filmen allerede er på watchlisten
        }
    }


    //Kode for at vise de film der ligger under WatchList
    public void displayWatchList(){
        if (watchList.isEmpty()) { //Bruges for at se om listen er tom
            System.out.println("Your WatchList is empty:"); //Besked til brugeren
        } else {
            System.out.println("Your WatchList:"); //Besked til brugeren
            for (Movie movie : watchList) { //Skal gå igennem den liste med alle film
                System.out.println(//Forstår ikke hvad der skal stå her)
            }
        }
    }

}

//boolean til om username og password er true eller false
    }
}