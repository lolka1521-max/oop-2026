import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Movie {
    private String director;
    private String title;
    private double rating;
    private Genre genre;
    private int releaseYear;

    public Movie(String director, String title, double rating, Genre genre, int releaseYear){
        this.director = director;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public static void addMovie(ArrayList<Movie> movies,String director, String title, double rating, Genre genre, int releaseYear){
        Movie movie = new Movie(director,title,rating,genre,releaseYear);

        movies.add(movie);
    }

    public static void userRating(ArrayList<Movie> movies){
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < movies.size(); i++) {
            System.out.println("Ennek a filmnek milyen ratinget adnal? " + movies.get(i).getTitle());
            double ujRating = scanner.nextDouble();
            movies.get(i).setRating(ujRating);
        }

        System.out.println("***************************");
        System.out.println(movies);
    }

    public static Movie searchTitle(ArrayList<Movie> movies, String title){
        for (int i = 0; i < movies.size(); i++){
            if(movies.get(i).getTitle().contains(title)){
                return movies.get(i);
            }
        }
        return null;
    }

    public static ArrayList<Movie> searchGenre(ArrayList<Movie> movies, Genre genre){
        ArrayList<Movie> moviegenre = new ArrayList<>();
        for (int i = 0; i < movies.size(); i++){
            if(movies.get(i).getGenre().equals(genre)){
                 moviegenre.add(movies.get(i));
            }
        }
        if(moviegenre.size() != 0){
            return moviegenre;
        }
        else return null;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public Genre getGenre(){
        return genre;
    }

    public double getRating(){
        return rating;
    }

    public String getTitle(){
        return title;
    }

    public String getDirector(){
        return director;
    }

    public String toString(){
        return "Movie: " +
                " Title: " + title +
                " Director: " + director +
                " Rating: " + rating +
                " Genre: " + genre +
                " ReleaseYear: " + releaseYear + '\n';
    }

}
