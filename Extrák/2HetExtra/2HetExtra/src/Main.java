//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ArrayList<Movie> movies = new ArrayList<>();

    try (Scanner scanner = new Scanner(new File("input.csv"))) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                continue;
            }
            String[] items = line.split(","); // trim: eliminates leading and trailing spaces
            String title = items[0].trim();
            String director = items[1].trim(); // Convert String→int: Integer.parseInt( String)
            int releaseYear = Integer.parseInt(items[2].trim());
            double rating = Double.parseDouble(items[3].trim());
            Genre genre = Genre.valueOf(items[4].trim());
            movies.add(new Movie(director,title, rating, genre, releaseYear ));
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    System.out.println(movies);
    System.out.println("************************");
    Movie talat = Movie.searchTitle(movies,"The Lord of the Rings: The Fellowship of the Ring");
    System.out.println(talat);
    System.out.println("************************");
    ArrayList<Movie> genremovies = Movie.searchGenre(movies, Genre.Thriller);
    System.out.println(genremovies);
    System.out.println("************************");
    Movie.addMovie(movies,"Lolo","Hell Yeah", 10, Genre.Comedy, 2000);
    System.out.println(movies);
    System.out.println("************************");
    Movie.userRating(movies);
}
